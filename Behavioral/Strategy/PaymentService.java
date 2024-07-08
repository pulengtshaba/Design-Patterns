package Behavioral.Strategy;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private void processOrder(){
        //pop up to collect card details from user
        CreditCard card = new CreditCard("cardNumber", "expiryDate", "cvv");
        //Validate the credit card...
        System.out.println("Paying "+getTotal()+" using credit card");
        card.setAmount(card.getAmount() - getTotal());
    }
    private int getTotal(){
        return includeDelivery ? cost + 10 : cost;
    }
}
