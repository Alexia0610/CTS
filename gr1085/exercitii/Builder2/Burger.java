package gr1085.exercitii.Builder2;

public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
