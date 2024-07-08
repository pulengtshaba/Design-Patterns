package Behavioral.ChainOfResponsibility;

import java.io.IOException;

public class Usage {
    public static void main(String[] args) throws IOException{
        Database database = new Database();
        Handler handler = new UserExistsHandler(database)
            .setNextHandler(new ValidPasswordHandler(database))
            .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.logIn("Username", "Password");
    }
}
