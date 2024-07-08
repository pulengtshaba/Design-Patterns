package Behavioral.Observer;

public class Store {
    private final NotificationService notificationService;
    public Store(){
        notificationService = new NotificationService();
    }
    public void newItemPromotion(){
        notificationService.notifies();
    }
    public NotificationService getService(){
        return notificationService;
    }
}
