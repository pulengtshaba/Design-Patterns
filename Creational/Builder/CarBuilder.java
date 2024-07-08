package Builder;

public class CarBuilder {
    private int id;
    private String brand;
    private String model;
    private String color;

    public void id(int id){
        this.id = id;
    }
    public void brand(String brand){
        this.brand = brand;
    }
    public void model(String model){
        this.model = model;
    }
    public void color(String color){
        this.color = color;
    }
    
    public Car build(){
        return new Car(id, brand, model, color);
    }
}
