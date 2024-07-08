package Behavioral.Strategy.Solution;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy strategy;
    
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void processOrder(){
        strategy.collectPaymentDetails();
        if(strategy.validatePaymentDetails()){
            strategy.pay(getTotal());
        }
    }
    private int getTotal(){
        return includeDelivery ? cost + 10 : cost;
    }
}
