import java.util.Random;

import javax.swing.JOptionPane;

import classes.User;
import database.DB;

public class Login {
  private static Login loginInstance;
  private static User loggedUser;

  private Login(String username, String password) {
    checkIfUserIsValid(username, password);
  }

  public static synchronized Login getInstance(String username, String password) {
    if (loginInstance == null) {
      loginInstance = new Login(username, password);
    }
    return loginInstance;
  }

  public static void showLoggedUser() {
    if (loggedUser == null) {
      System.out.println("Não ha usuario logado");
    } else {
      System.out.println("User: " + loggedUser.getNome());

    }

  }

  private static void checkIfUserIsValid(String username, String password) {
    DB connection = new DB();

    for (User user : connection.getUsers()) {
      if (user.getUsername() == username && user.getPassword() == password) {
        if (checkCaptcha()) {
          loggedUser = user;
        }

      }
    }
    if (loggedUser == null) {
      System.out.println("Usuario ou senha estao incorretos!");
    }
  }

  private static boolean checkCaptcha() {
    Random generate = new Random();

    String captcha = "";

    for (int i = 0; i < 4; i++) {
      captcha += Character.toString((char) (generate.nextInt(74) + 48));
    }

    String response = JOptionPane.showInputDialog("Verificação, digite a sequencia: " + captcha);

    if (response.intern() == captcha.intern())
      return true;
    return false;

  }
}
