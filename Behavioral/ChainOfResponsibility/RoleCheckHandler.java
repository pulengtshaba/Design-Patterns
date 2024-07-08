package Behavioral.ChainOfResponsibility;

public class RoleCheckHandler extends Handler{
    @Override
    public boolean handle(String username, String password){
        if("Admin_username".equals(username)){
            System.out.println("Loading Admin page...");
            return true;
        }
        System.out.println("Loading default page...");
        return handle(username, password);
    }
}
