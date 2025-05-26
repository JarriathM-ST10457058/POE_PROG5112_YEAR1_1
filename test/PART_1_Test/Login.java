package PART_1_Test;

import java.util.Scanner;

/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */
public class Login {
    static Register objRegister = new Register();

    private String Username;
    private String Password;
    private String CellNum;

    private String LoginUsername;
    private String LoginPassword;

    private Scanner scanner = new Scanner(System.in);

    // Method for Username Requirements
    public boolean checkUsername() {
        while (true) {
            System.out.print("Please enter your Username: ");
            Username = scanner.nextLine();

            if (Username.isEmpty()) {
                System.out.println("Login cancelled.");
                return false;
            }
            if (Username.equals(objRegister.getUsername())) {
                return true;
            }
            System.out.println("Username or Password incorrect.");
        }
    }

    // Method for password requirements
    public boolean checkPasswordComplexity() {
        while (true) {
            System.out.print("Please enter your Password: ");
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

    public boolean checkCellphoneNumber() {
        while (true) {
            System.out.print("Please enter your CellPhone Number: ");
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

    public void RegisterUser() {
        checkUsername();
        checkPasswordComplexity();
        checkCellphoneNumber();
        System.out.println("You have been Registered Successfully!");
    }

    public boolean LoginUser() {
        System.out.print("Please enter your Username: ");
        LoginUsername = scanner.nextLine();

        System.out.print("Please enter your Password: ");
        LoginPassword = scanner.nextLine();

        if (LoginUsername.equals(Username) && LoginPassword.equals(Password)) {
            return true;
        }

        System.out.println("Username or Password incorrect, please try again.");
        return false;
    }

    public boolean ReturnLoginStatus() {
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

    public void returnLoginStatus() {
        boolean loggedIn = LoginUser();
        ReturnLoginStatus();
        if (loggedIn) {
            System.out.println("Welcome " + objRegister.getFirstName() + " " + objRegister.getSurname() + ", it is great to see you.");
        }
    }

   
}

    



