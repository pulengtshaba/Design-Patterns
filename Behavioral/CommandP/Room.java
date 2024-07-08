package Behavioral.CommandP;

public class Room {
    private Light light;
    public Room(){
        this.light = new Light();
    }
    public void switchLights(){
        light.setSwitchedOn(!light.isSwitchedOn());
    }
}
