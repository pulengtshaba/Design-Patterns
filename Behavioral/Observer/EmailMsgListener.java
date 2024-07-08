package Behavioral.Observer;

public class EmailMsgListener implements EventListener{
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }
    @Override
    public void update(){
        // actually send the email
    }
}
