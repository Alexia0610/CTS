package gr1085.exercitii.Singleton;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

//        System.out.println("Hashcode of x is " + x.hashCode());
//        System.out.println("Hashcode of y is " + y.hashCode());
//        System.out.println("Hashcode of z is " + z.hashCode());
//
//        if (x == y && y == z) {
//            System.out.println("Three objects point to the same memory location on the heap, to the same object");
//        } else {
//            System.out.println("Three objects DO NOT point to the same memory location on the heap");
//        }

        x.s = x.s.toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        z.s = (z.s).toLowerCase();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
    }
}
