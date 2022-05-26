package gr1085.lab10.strategy;

public class SocialMediaContext
{
    ISocialMediaStrategy messageStrategy;

    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy)
    {
        this.messageStrategy = smStrategy;
    }

    public void connect(String name)
    {
        messageStrategy.connectTo(name);
    }
}