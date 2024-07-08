package Prototype;

public class Bus extends Vehicle {
    protected Bus(Vehicle vehicle) {
        super(vehicle);
        //TODO Auto-generated constructor stub
    }

    private int doors;

    @Override
    public Bus clone(){
        return new Bus(this);
    }
}
