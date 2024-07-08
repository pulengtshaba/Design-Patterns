package Structural.Facade;

public class DatabaseService {
    public User getUser(String userId){
        return new User(userId,"Puleng",2000,"BTC","123456");
    }
}
