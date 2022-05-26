package gr1085.lab11.command;

public class OperatiuneBancara {
    protected Cont cont;

    public OperatiuneBancara(){
        cont = new Cont();
    }

    public abstract void efectuareOperatiune(int suma) throws InterruptedException;
}
