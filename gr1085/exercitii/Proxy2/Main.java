package gr1085.exercitii.Proxy2;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
