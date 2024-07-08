package Behavioral.Observer;

import Behavioral.Observer.EmailMsgListener;
import Behavioral.Observer.Store;

public class Usage {
    public static void main(String[] args) {
        Store store = new Store();
        store.getService().subscribe(new EmailMsgListener("puleng@gmail.com"));
        store.getService().subscribe(new MobileAppListener("Geekpull"));
        store.newItemPromotion();
    }
}
