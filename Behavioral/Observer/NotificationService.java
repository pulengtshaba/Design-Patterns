package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

import Behavioral.Observer.MobileAppListener;

public class NotificationService {
    private final List<EmailMsgListener> customers;
    public NotificationService(){
        customers = new ArrayList<>();
    }
    public void subscribe(EmailMsgListener emailMsgListiner){
        customers.add(emailMsgListiner);
    }
    public void unsuscribe(EmailMsgListener emailMsgListiner){
        customers.remove(emailMsgListiner);
    }

    public void notifies(){
        customers.forEach(listiner -> listiner.update());
    }
    public void subscribe(MobileAppListener mobileAppListener) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subscribe'");
    }
}
