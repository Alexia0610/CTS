package gr1085.Tema_CTS_Flyweight_Iacobescu_Alexia;

public class Car {
    String dimensiune;
    String model;
    String culoare;

    public Car(String dimensiune, String model, String culoare) {
        this.dimensiune = dimensiune;
        this.model = model;
        this.culoare = culoare;
    }

    public Car(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void showColor() {
        System.out.println("Culoarea masinii este: " + this.culoare);
    }
}
