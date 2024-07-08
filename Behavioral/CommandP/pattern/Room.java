package Behavioral.CommandP.pattern;

public class Room {
    Command command;
    public Room(){}
    public void setCommand(Command command){
        this.command=command;
    }
    public void executeCommand(){
        command.execute();
    }
}
/*
public class Room {
    private Light light;
    public Room(){
        this.light = new Light();
    }
    public void switchLights(){
        light.switchLights();
    }
} */
