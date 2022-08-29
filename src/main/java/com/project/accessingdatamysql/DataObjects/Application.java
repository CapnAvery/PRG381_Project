package src.main.java.com.example.accessingdatamysql.DataObjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import src.main.java.src.main.java.src.main.java.com.example.accessingdatamysql.Admin;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    AdminView admin = new AdminView();
    admin.setVisible(true);
  }

}
