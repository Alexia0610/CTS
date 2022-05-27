package gr1085.exercitii.FactoryMethod1;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}
