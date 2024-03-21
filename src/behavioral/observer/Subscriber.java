package behavioral.observer;

public class Subscriber {
    private int id;

    public Subscriber(int id){
        this.id = id;
    }
    public void notify(String data){
        System.out.println("Subscriber "+id+" is notified for data: "+data);
    }
}
