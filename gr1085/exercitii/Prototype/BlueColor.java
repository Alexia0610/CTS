package gr1085.exercitii.Prototype;

public class BlueColor extends Color{

    public BlueColor() {
        this.colorName = "blue";
    }
    @Override
    void addColor() {
        System.out.println("Blue color added");
    }
}
