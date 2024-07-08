package Structural.Facade;
//@Data
public class User {
    private String id;
    private String name;
    private double balance;
    private String currency;
    private String accountNbr;
    User(String a,String b,double c,String d,String e){
        this.id =a;
        this.name =b;
        this.balance =c;
        this.currency =d;
        this.accountNbr =e;
    }
    public double getBalance() {
        return balance;
    }
    
}