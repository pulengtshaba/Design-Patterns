package Structural.Facade.facade;

public class Usage {
    public static void main(String[] args) throws Exception{
        BuyCryptoFacade buyCryptoFacade = new BuyCryptoFacade();
        buyCryptoFacade.BuyCryptoCurrency(1000,"BTC");
        /*
        DatabaseService databaseService = new DatabaseService();
        User user = databaseService.getUser(UIService.getLoggedInUserId());
        CryptoFactory.getCryptoService("BTC").buyCurrency(user, 1000); */
    }
}
