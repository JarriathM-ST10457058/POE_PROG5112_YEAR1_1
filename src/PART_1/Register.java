package PART_1;

import java.util.Scanner;


/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */

public class Register {
private String FirstName;
        private String Surname;
        private String Username;
        private String CellNum;
        private String Password;

        private Scanner scanner = new Scanner(System.in);
// Setters and Getters

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getCellNum() {
        return CellNum;
    }

    public void setCellNum(String CellNum) {
        this.CellNum = CellNum;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
                
// Constructor
    public Register() {
        this.FirstName = "";
        this.Surname = "";
        this.Username = "";
        this.CellNum = "";
        this.Password = "";
    }

// User Info Input
    public void UserInfo(){
        System.out.print("Please enter your First Name: \n " );
        setFirstName(scanner.nextLine());

        System.out.print("Please enter your Last Name:\n ");
        setSurname(scanner.nextLine());
    }
//Username Requirements
    public boolean RegisterUser() {
        //Requirements Loop
        while (true) {
            System.out.print("Please enter a Username (must contain an underscore and be less than 5 characters): \n ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Registration cancelled.");
                return false;
            }

            setUsername(input);

            if (Username.contains("_") && Username.length() < 5) {
                System.out.println("Username is successfully captured.");
                return true;
            }

            System.out.println("Username is not correctly formatted. Please ensure it contains an underscore and is no more than five characters in length. \n");
        }
    }
//Password Requirements
    public boolean RegisterPassword() {
        //Requirements Loop
    while (true) {
            System.out.print("Please enter a Password (must contain one uppercase letter, more than 8 characters, a number, and a special character): \n ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Registration cancelled.");
                return false;
            }

            setPassword(input);

            if (Password.matches(".*[A-Z].*") && Password.length() > 8 && Password.matches(".*[0-9].*") && Password.matches(".*[!@#$%^&*<>/?_:+\\-=].*")) {
                System.out.println("Password is successfully captured.");
                return true;
            }

            System.out.println("Password is not correctly formatted. Please ensure it contains at least 8 characters, a capital letter, a number, and a special character.");
        }
    }
//Cellphone Number Requirements
    public boolean RegisterCellNum(){
        //Requirements Loop
    while (true) {
            System.out.print("Please enter your CellPhone Number: \n ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Registration cancelled.");
                return false;
            }

            setCellNum(input);

            if (CellNum.length() > 10 && CellNum.startsWith("27")) {
                System.out.println("Cellphone Number is successfully added.");
                return true;
            }

            System.out.println("Cellphone Number is incorrectly formatted or does not contain an international code (should start with '27').");
        }
    }
}