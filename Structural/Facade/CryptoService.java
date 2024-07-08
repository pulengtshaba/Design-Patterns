package Structural.Facade;

public abstract class CryptoService {
    public abstract void buyCurrency(User user, double amount);
    abstract void sellCurrency(User user, double amount);
    abstract void storeCurrency(User user, double amount);
}
