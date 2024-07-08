package Behavioral.CommandP.pattern;

public class FloorLamb {
    private Light light;
    public FloorLamb(){
        this.light = new Light();
    }
    public void switchLights(){
        light.switchLights();
    }
}
