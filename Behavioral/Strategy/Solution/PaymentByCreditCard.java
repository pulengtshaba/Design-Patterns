package Behavioral.Strategy.Solution;

import Behavioral.Strategy.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy{
    private CreditCard card;
    @Override
    public void collectPaymentDetails() {
        CreditCard card = new CreditCard("cardNumber", "expiryDate", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        //validate credit card...
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+amount+" using credit card");
        card.setAmount(card.getAmount() - amount);
    }
}
