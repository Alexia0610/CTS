package gr1085.lab10.state2;

public class Available implements State{
    @Override
    public void doAction() {
        System.out.println("State changed to: Available");
    }
}
