package gr1085.exercitii.Proxy1;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to "+serverhost);
    }
}
