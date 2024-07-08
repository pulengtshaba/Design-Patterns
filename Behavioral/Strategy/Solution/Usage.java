package Behavioral.Strategy.Solution;

public class Usage {
    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();
        //strategy can now be easily picked at runtime
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    } 
}
