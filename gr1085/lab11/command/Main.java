package gr1085.lab11.command;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Server s = Server.getInstance();
        
        s.addOperatiune(new AlimentareCont());
        s.addOperatiune(new Transfer());
        s.prelucrareOperatiuni();



    } 
}
