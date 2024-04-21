package database;

import classes.User;
import java.util.ArrayList;

public class DB {
  ArrayList<User> users = new ArrayList<User>();

  public DB() {
    this.populateWithFixture();
  }

  public ArrayList<User> getUsers() {
    return users;
  }

  private void populateWithFixture() {
    users.add(new User("Adriano", "adrianocosta@gmail.com", "adrianocosta", "senha123"));
    users.add(new User("Pedro Silva", "pedrosilva@gmail.com", "pedrosilva", "senha123"));
    users.add(new User("Angela Cardoso", "angelacardoso@gmail.com", "angelacardoso", "senha123"));
    users.add(new User("Marilia mendonça", "mariliamendonça@gmail.com", "mariliamendonça", "senha123"));
    users.add(new User("Antonio Silva", "antoniosilva@gmail.com", "antoniosilva", "senha123"));
    users.add(new User("Neco Peixoto", "necopeixoto@gmail.com", "necopeixoto", "senha123"));
  }
}
