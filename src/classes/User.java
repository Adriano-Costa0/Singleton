package classes;
import java.sql.Timestamp;

public class User {
  private String nome;
  private String email;
  private String createdAt;
  private String username;
  private String password;

  public User(String nome, String email, String username, String pwd){
    this.nome = nome;
    this.email = email;
    this.username = username;
    this.password = pwd;
    this.createdAt =  new Timestamp(System.currentTimeMillis()).toString();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
