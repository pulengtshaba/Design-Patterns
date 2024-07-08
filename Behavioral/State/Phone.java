package Behavioral.State;

public class Phone {
    private State state;
    public Phone(){
        state = new OffState(this);
    }
    public void setState(State state){
        this.state = state;
    }
    public String lock(){
        return "Lock phone and turn off the screen";
    }
    public String home(){
        return "going to home-screen";
    }
    public String unlock(){
        return "Unlock the phone to home";
    }
    public String turnOn(){
        return "Turn on screen, device still locked";
    }
}
