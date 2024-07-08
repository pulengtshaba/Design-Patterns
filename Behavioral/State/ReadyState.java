package Behavioral.State;

public class ReadyState extends State{
    public ReadyState(Phone phone){
        super(phone);
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOften() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
