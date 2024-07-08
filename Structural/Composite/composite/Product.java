package Structural.Composite.composite;
//@Data
public abstract class Product implements Box {
    protected final String title;
    protected final double price;
    public Product(String title2, double price2) {
        //TODO Auto-generated constructor stub
        this.title = title2;
        this.price = price2;
    }
    public double getPrice(){
        return this.price;
    }
}
