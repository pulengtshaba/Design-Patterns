package Structural.Facade;

public class UIService {
    public static String getLoggedInUserId(){
        return "1";
    }
    public boolean logIn(String username, String password){
        return true;
    }
    public boolean logout(){
        return false;
    }
    
}
