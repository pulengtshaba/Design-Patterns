package Behavioral.Observer.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Behavioral.Observer.EmailMsgListener;

public class NotificationService{
    private final Map<Event,List<EventListener>> customers;
    public NotificationService(){
        customers = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customers.put(event,new ArrayList<>()));
    }
    public void subscribe(Event event, EventListener listener){
        customers.get(event).add(listener);
    }
    public void unsuscribe(Event event, EventListener listener){
        customers.get(event).remove(listener);
    }

    public void notifies(Event event){
        customers.get(event).forEach(listener -> listener.update(event));
    }
}
