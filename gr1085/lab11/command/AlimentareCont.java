package gr1085.lab11.command;

public class AlimentareCont extends OperatiuneBancara{

    @Override
    public void efectuareOperatiune(int suma) {
        super.cont.Alimentare(suma);
    }
}
