package Structural.Composite;

import java.util.List;

//AllArgsConstructor
public class Box {
    private List<Box> boxes;
    private List<Product> products;
    public Box(List<Box> emptyList, List<Product> asList) {
        //TODO Auto-generated constructor stub
        this.boxes = emptyList;
        this.products = asList;
    }
    public double calculatePrice(){
        double sum = products.stream().mapToDouble(Product::getPrice).sum();
        for(Box box : boxes){
            sum = sum + box.calculatePrice();
        }
        return sum;
    }
}
