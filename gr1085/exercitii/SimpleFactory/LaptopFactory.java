package gr1085.exercitii.SimpleFactory;

public class LaptopFactory {
    public static Laptop createLaptop(String laptopType) {
        if (laptopType == null) {
            return null;
        }

        switch (laptopType) {
            case "NormalLaptop":
                return new NormalLaptop();
            case "GamingLaptop":
                return new GamingLaptop();
            default:
                throw new IllegalArgumentException("Unknown laptop type "+laptopType);
        }
    }
}
