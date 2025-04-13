package PART_1_Test;

import javax.swing.JOptionPane;

/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */

public class Register {
private String FirstName;
        private String Surname;
        private String Username= "kyl_1";
        private String CellNum;
        private String Password;

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
        setFirstName(JOptionPane.showInputDialog(null, "Please enter your First Name", "Register", JOptionPane.PLAIN_MESSAGE));
         setSurname(JOptionPane.showInputDialog(null, "Please enter your Last Name", "Register", JOptionPane.PLAIN_MESSAGE));
}
//Username Requirements
    public boolean RegisterUser() {
        //Requirements Loop
    while (true) { 
        setUsername(JOptionPane.showInputDialog(null,"Please enter a Username \n(Username must contain an underscore and be less than 5 characters.)","Register", JOptionPane.PLAIN_MESSAGE));

        if (Username == null) {
            JOptionPane.showMessageDialog(null, "Registration cancelled.");
            return false;
        }
        if (Username.contains("_") && Username.length() < 5) {
            JOptionPane.showMessageDialog(null, "Username is successfully captured.");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an Underscore and is no more than Five chracters in length.");
    }
}
//Password Requirements
    public boolean RegisterPassword() {
        //Requirements Loop
    while (true) { 
        setPassword(JOptionPane.showInputDialog(null, "Please enter a Password \n( Password must contain one Uppercase letter, More than 8 characters and a Special Character.)", "Register", JOptionPane.PLAIN_MESSAGE));
     
        if (Password == null) {
            JOptionPane.showMessageDialog(null, "Registration cancelled.");
            return false;
        }
        if (Password.matches(".*[A-Z].*") && Password.length() > 8 && Password.matches(".*[0-9].*") && Password.matches(".*[!@#$%^&*<>/?_:+-=].*")){
            JOptionPane.showMessageDialog(null, "Password is successfully captured.");
            return true;
            
        }
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted \n (Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
    }
}  
//Cellphone Number Requirements
    public boolean RegisterCellNum(){
        //Requirements Loop
    while (true) { 
        setCellNum(JOptionPane.showInputDialog(null, "Please enter your CellPhone Number", "Register", JOptionPane.PLAIN_MESSAGE));
        if (CellNum == null) {
            JOptionPane.showMessageDialog(null, "Registration cancelled.");
            return false;
        }
        if(CellNum.length()>10 && CellNum.contains("27")){
            JOptionPane.showMessageDialog(null, "Cellphone Number is successfully added.");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Cell phone Number is incorrectly formatted or does not contain an international code.");
    
    }   
    }
}