/*Ensure that only one instance of a class exist and 
provides a single point of access to this instance from
anywhere in the application*/
public class Singleton {

    private static Singleton instance;
    private String data;
    private Singleton(String data){
        this.data = data;
    }
    public static Singleton getInstance(String data){
        if(instance == null){
            instance = new Singleton(data);
            return instance;
        }else{
            return instance;
        }
    }
}
