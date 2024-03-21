package behavioral.observer;

public class MainClass {

    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber(1);
        Subscriber sub2 = new Subscriber(2);
        Subscriber sub3 = new Subscriber(3);
        Subscriber sub4 = new Subscriber(4);

        Publisher publisher = new Publisher();

        publisher.registerSubscriber(sub1);
        publisher.registerSubscriber(sub2);
        publisher.registerSubscriber(sub3);
        publisher.registerSubscriber(sub4);

        publisher.uploadData("Data 1");
        System.out.println("**********************************");
        publisher.unregisterSubscriber(sub1);
        publisher.uploadData("Data 2");

    }
}
