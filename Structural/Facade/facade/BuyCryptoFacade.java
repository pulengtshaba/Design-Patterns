package Structural.Facade.facade;

import Structural.Facade.CryptoFactory;
import Structural.Facade.DatabaseService;
import Structural.Facade.UIService;
import Structural.Facade.User;

public class BuyCryptoFacade {
    public void BuyCryptoCurrency(double amount, String currency){
        DatabaseService databaseService = new DatabaseService();
        User user = databaseService.getUser(UIService.getLoggedInUserId());
        if(user.getBalance() < amount){
            System.out.println("Insufficient balance to perform transaction");
            return;
        }
        CryptoFactory.getCryptoService(currency).buyCurrency(user,amount);
    }
}
