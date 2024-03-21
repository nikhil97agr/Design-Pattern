package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    List<Subscriber> subscribers;

    public Publisher(){
        subscribers = new ArrayList<>();
    }

    public void registerSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unregisterSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void uploadData(String data){
        subscribers.forEach(subscriber -> subscriber.notify(data));
    }
}
