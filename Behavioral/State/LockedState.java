package Behavioral.State;

public class LockedState extends State{
    public LockedState(Phone phone){
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String onOften() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
