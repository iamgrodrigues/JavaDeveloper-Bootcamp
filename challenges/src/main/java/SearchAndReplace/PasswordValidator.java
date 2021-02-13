package SearchAndReplace;

import java.util.Scanner;

public class PasswordValidator {

  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);

    String password;
    final String required = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,32})$";
    final String allowed = "[a-zA-Z0-9]+";

    while(scr.hasNextLine()) {
      password = scr.nextLine();

      if(password.matches(allowed) && password.matches(required)){
        System.out.println("Senha valida.");
      } else {
        System.out.println("Senha invalida.");
      }
    }
  }
}
