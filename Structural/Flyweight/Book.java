package Structural.Flyweight;

public class Book {
    private String type;
    private String name;
    private double price;
    private String distributor;
    private String otherData;
    public Book(String type, String name, double price, String distributor, String otherData) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.distributor = distributor;
        this.otherData = otherData;
    }
    
}
