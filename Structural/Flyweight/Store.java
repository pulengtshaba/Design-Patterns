package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Book> books = new ArrayList<>();
    public void storeBook(String name, double price,String type,String distributor,String otherData){
        books.add(new Book(type, name, price, distributor, otherData));
    }
    public void displayBooks(){
        for(Book book:books){
            //show em
        }
    }
}
