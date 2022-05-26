package gr1085.Tema_CTS_Flyweight_Iacobescu_Alexia;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map mapCar = new HashMap();

    public static Car getCar(String culoare) {
        Car car = (Car) mapCar.get(culoare);
        if (car != null) {
            return car;
        } else {
            car = new Car(culoare);
            mapCar.put(culoare, car);
        }
        return car;
    }
}
