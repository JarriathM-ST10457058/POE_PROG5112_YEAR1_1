package PART_1;


import PART_2_3.MessageHandler;
import java.util.Scanner;
/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */
public class MainClass {
    //Static Classes Callers
static Register objRegister = new Register();
static Login objLogin = new Login();


    public static void main(String[] args) {
        // TODO code application logic here
        Register();
        Login();
        showMenu();
    }
    private static void Register(){
    //Get Register Methods
    System.out.println("REGISTER");
        objRegister.UserInfo();
        objRegister.RegisterUser();
        objRegister.RegisterPassword();
        objRegister.RegisterCellNum();
     }   
     private static void Login(){
    //Get Login Methods
    System.out.println("LOGIN");
        objLogin.LoginUser();
        boolean loginSuccess = objLogin.LoginUser();
    objLogin.ReturnLoginStatus();

    if (loginSuccess) {
        System.out.println("Welcome " + objRegister.getFirstName() + " " + objRegister.getSurname() + ", it is great to see you.");
        showMenu();
    } else {
        
    }
}
//PART 2 Show menu for user's options
private static void showMenu() {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        System.out.println("\nMenu:");
        System.out.println("1. Send Messages");
        System.out.println("2. View Sent Messages");
        System.out.println("3. View Reports"); // PART3REPORT
        System.out.println("4. Quit");
        System.out.print("Enter choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> MessageHandler.sendMessages();
            case 2 -> System.out.println("Coming Soon.");
            case 3 -> MessageHandler.showReportMenu();//Call Report menu 
            case 4 -> System.out.println("Exiting program...");
            default -> System.out.println("Invalid option. Try again.");
        }
    } while (choice != 4);
}
}
