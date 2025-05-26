package PART_1;

import java.util.Scanner;

/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */

public class Login {
    static Register objRegister= new Register();
    
    String Username;
    String Password;
    String CellNum;
    private String LoginUsername;
    private String LoginPassword;

    private Scanner scanner = new Scanner(System.in);
    
// Method for Username Requirements   
public boolean checkUsername(){
    while (true) {
            System.out.print("Please enter your Username: \n ");
            Username = scanner.nextLine();

            if (Username.isEmpty()) {
                System.out.println("Login cancelled.");
                return false;
            }
            if (!Username.equals(objRegister.getUsername())) {
            } else {
                return true;
        }
            System.out.println("Username incorrect.");
        }
    }
//Method for password requirements   
public boolean checkPasswordComplexity(){
    while (true) {
            System.out.print("Please enter your Password:\n ");
            Password = scanner.nextLine();

            if (Password.isEmpty()) {
                System.out.println("Login cancelled.");
                return false;
            }
            if (Password.equals(objRegister.getPassword())) {
                return true;
            }
            System.out.println("Password incorrect.");
        }
    }
public boolean checkCellphoneNumber(){
    while (true) {
            System.out.print("Please enter your CellPhone Number: \n ");
            CellNum = scanner.nextLine();

            if (CellNum.isEmpty()) {
                System.out.println("Login cancelled.");
                return false;
            }
            if (CellNum.length() > 10 && CellNum.startsWith("27")) {
                return true;
            }
            System.out.println("Cell phone Number is incorrectly formatted or does not contain an international code.");
        }
    }

 public String RegisterUser(){
    checkUsername();
        checkPasswordComplexity();
        checkCellphoneNumber();
        System.out.println("You have been Registered Successfully!");
        return null;
    } 
 
 public boolean LoginUser(){
       System.out.print("Please enter your Username:  ");
        LoginUsername = scanner.nextLine();

        System.out.print("Please enter your Password: ");
        LoginPassword = scanner.nextLine();

        if (LoginUsername.equals(Username) && LoginPassword.equals(Password)) {
            return true;
        }

        System.out.println("Username or Password incorrect, please try again.");
        return false;
    }

 public boolean ReturnLoginStatus(){
       if (LoginUsername == null || LoginPassword == null || CellNum == null) {
            System.out.println("Login cancelled.");
            return false;
        }
        if (LoginUsername.equals(Username) && LoginPassword.equals(Password)) {
            System.out.println("A Successful Login.");
            return true;
        }
        System.out.println("A Failed Login.");
        return false;
    }
 public String returnLoginStatus(){
     boolean loggedIn = LoginUser();
        ReturnLoginStatus();
        if (loggedIn) {
            System.out.println("Welcome " + objRegister.getFirstName() + " " + objRegister.getSurname() + ", it is great to see you.");
        }
        return null;
 }
}


    



