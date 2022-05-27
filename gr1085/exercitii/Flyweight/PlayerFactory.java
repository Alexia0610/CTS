package gr1085.exercitii.Flyweight;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> hm =
            new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player p = null;
        if (hm.containsKey(type)) {
            p = hm.get(type);
        } else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    p = new Terrorist();
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    p = new CounterTerrorist();
                default :
                    System.out.println("Unreachable code!");
            }
            hm.put(type, p);
        }
        return p;
    }
}
