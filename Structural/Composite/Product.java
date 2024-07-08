package Structural.Composite;
//@Data
//@AllArgsConstructor
public class Product {
    private String title;
    private double price;
    Product(String t, double p){
        this.title = t;
        this.price = p;
    }
    public double getPrice(){
        return this.price;
    }
}
