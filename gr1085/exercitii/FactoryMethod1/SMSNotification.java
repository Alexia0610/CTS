package gr1085.exercitii.FactoryMethod1;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
