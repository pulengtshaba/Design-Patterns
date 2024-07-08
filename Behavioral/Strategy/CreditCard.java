package Behavioral.Strategy;

public class CreditCard {
    private int amount = 1_000;
    private final String number;
    private final String date;
    private final String cvv;
    public CreditCard(String number, String date, String cvv) {
        //this.amount = amount;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    
}
