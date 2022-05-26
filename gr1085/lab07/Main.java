package gr1085.lab07;

public class Main {
    public static void main(String[] args) {

        Vehicle c1 = new Car();

        Vehicle c2 = new CarWithHeating(c1);

        c1.startEngine();
        c2.startEngine();


    }
}
