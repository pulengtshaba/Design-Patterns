package Structural.Facade;

public class Usage {
    public static void main(String[] args) throws Exception{
        DatabaseService databaseService = new DatabaseService();
        User user = databaseService.getUser(UIService.getLoggedInUserId());
        CryptoFactory.getCryptoService("BTC").buyCurrency(user, 1000);
    }
}
