package gr1085.exercitii.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        LaptopFactory laptopFactory = new LaptopFactory();
        Laptop laptop = laptopFactory.createLaptop("GamingLaptop");
        laptop.runTests();
    }
}
