package Structural.Facade;

public class BitcoinService extends CryptoService{
    @Override
    public void buyCurrency(User user, double amount){}

    @Override
    void sellCurrency(User user, double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sellCurrency'");
    }

    @Override
    void storeCurrency(User user, double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'storeCurrency'");
    }
}
