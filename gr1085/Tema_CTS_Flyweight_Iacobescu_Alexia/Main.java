package gr1085.Tema_CTS_Flyweight_Iacobescu_Alexia;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> culori = Arrays.asList("red", "blue", "gray", "red", "balck", "yellow", "white", "pink");
        for (int i = 0; i < culori.size(); i++) {
            Car car = CarFactory.getCar(culori.get(i));
            car.showColor();
        }
    }
}
