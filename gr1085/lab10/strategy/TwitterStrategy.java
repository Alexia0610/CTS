package gr1085.lab10.strategy;

public class TwitterStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}