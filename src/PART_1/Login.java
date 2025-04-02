package PART_1;

import javax.swing.JOptionPane;
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
// Method for Username Requirements   
public boolean checkUsername(){
    while (true) { 
  
        Username= (JOptionPane.showInputDialog(null,"Please enter your Username","Login", JOptionPane.PLAIN_MESSAGE));

        if (Username == null) {
            JOptionPane.showMessageDialog(null, "Login cancelled.");
            return false;
        }
        if (Username.matches(objRegister.getUsername())) {            
            return true;
        }
        JOptionPane.showMessageDialog(null, "Username or Password incorrect", "Login", JOptionPane.PLAIN_MESSAGE);
    }
        }
//Method for password requirements   
public boolean checkPasswordComplexity(){
    while (true) { 
  
        Password= (JOptionPane.showInputDialog(null,"Please enter your Password","Login", JOptionPane.PLAIN_MESSAGE));

        if (Password == null) {
            JOptionPane.showMessageDialog(null, "Login cancelled.");
            return false;
        }
        if (Password.matches(objRegister.getPassword())) {            
            return true;
        }
        JOptionPane.showMessageDialog(null, "Username or Password incorrect", "Login", JOptionPane.PLAIN_MESSAGE);
    }
        }
public boolean checkCellphoneNumber(){
    while (true) { 
        
        CellNum = (JOptionPane.showInputDialog(null, "Please enter your CellPhone Number", "Login", JOptionPane.PLAIN_MESSAGE));
        if (CellNum == null) {
            JOptionPane.showMessageDialog(null, "Login cancelled.");
            return false;
        }
        if(CellNum.length()>10 && CellNum.contains("27")){
            return true;
        }
        JOptionPane.showMessageDialog(null, "Cell phone Number is incorrectly formatted or does not contain an international code.", "Login", JOptionPane.PLAIN_MESSAGE);
    }   
    }

 public String RegisterUser(){
    checkUsername();
    checkPasswordComplexity();
    checkCellphoneNumber();
    JOptionPane.showMessageDialog(null, "You have been Registered Successfully", "Login", JOptionPane.PLAIN_MESSAGE);
        return null;
   
 } 
      String LoginUsername;
       String LoginPassword;
       
 public boolean LoginUser(){
        LoginUsername= JOptionPane.showInputDialog(null, "Please enter your Username", "Login", JOptionPane.PLAIN_MESSAGE);
        LoginPassword= JOptionPane.showInputDialog(null, "Please enter your Password", "Login", JOptionPane.PLAIN_MESSAGE);
    do {      
        if(LoginUsername.matches(Username)&& LoginPassword.matches(Password)){
        return true;
        }
        
    }
    while (false);
        JOptionPane.showMessageDialog(null, "Username or Password incorrect,please try again.");
        return false;  
        
 }

 public boolean ReturnLoginStatus(){
       while (true) { 
        if (LoginUsername == null && LoginPassword == null && CellNum == null) {
            JOptionPane.showMessageDialog(null, "Login cancelled.");
            return false;
        }
        if (LoginUsername.matches(Username)&& LoginPassword.matches(Password)){ 
            JOptionPane.showConfirmDialog(null, "A Successful Login", "Login", JOptionPane.PLAIN_MESSAGE);
            return true;
        }
        JOptionPane.showConfirmDialog(null, "A Failed Login", "Login", JOptionPane.PLAIN_MESSAGE);
    }
        }
 public String returnLoginStatus(){
     LoginUser();
     ReturnLoginStatus();
     JOptionPane.showMessageDialog(null, "Welcome "+ objRegister.getFirstName() + " " + objRegister.getSurname() + ", it is great to see you again.");
        return null;
 }
}

    



