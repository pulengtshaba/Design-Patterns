package Behavioral.CommandP.pattern;

public class Light {
    private boolean switchedOn;
    
    public void switchLights(){
        this.switchedOn = !switchedOn;
    }
}
