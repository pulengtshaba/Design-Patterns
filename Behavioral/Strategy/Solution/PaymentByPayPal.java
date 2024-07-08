package Behavioral.Strategy.Solution;

public class PaymentByPayPal implements PaymentStrategy{
    private String email;
    private String password;
    @Override
    public void collectPaymentDetails() {
        //pop up to collect mail & password
        email="...";
        password="...";
    }

    @Override
    public boolean validatePaymentDetails() {
        //check for errors
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" using paypal");
    }
    
}
