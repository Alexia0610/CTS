package gr1085.exercitii.Builder;

public class TipiHouseBuilder implements HouseBuilder{
    private House house;

    public TipiHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood, cariboi and seal skins");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Fire Wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
