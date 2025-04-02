package PART_1;

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
    }
    private static void Register(){
    //Get Register Methods
        objRegister.UserInfo();
        objRegister.RegisterUser();
        objRegister.RegisterPassword();
        objRegister.RegisterCellNum();
     }   
     private static void Login(){
    //Get Login Methods
        objLogin.RegisterUser();
        objLogin.returnLoginStatus();
        
        
     } 
}
