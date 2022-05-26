package gr1085.lab10.state2;

public class Occupied implements State{
    @Override
    public void doAction() {
        System.out.println("State changed to: Occupied");
    }
}
