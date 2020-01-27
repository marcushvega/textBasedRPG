package extra;

import java.util.HashMap;

public class MyToon
{
    private HashMap<String, Integer> attacks;   // Attack Type, Attack Power  Ex: (Melee, 4)
    private HashMap<String, Integer> bag;       // Item Name, Amount of Items Ex: (health potion, 3)
    private int[] position;
    private int health;
    private HashMap<String, Integer> stats;     // Stat name, Stat Power Ex: (DEX, 8)

    // default constructor
    // base stats
    // base armour = base number + a portion of DEX + a portion of CONST
    public MyToon() {
        attacks = new HashMap<String, Integer>();
        attacks.put("PUNCH", 1);

        bag = new HashMap<String, Integer>();
        bag.put("BUTTER KNIFE", 1);
        bag.put("SALAD FORK", 1);
        bag.put("SOUP SPOON", 1);
        bag.put("Heatlh Potion", 1);

        stats = new HashMap<String, Integer>();
        stats.put("STRENGTH", 10);
        stats.put("KNOWLEDGE", 9);
        stats.put("DEXTERITY", 8);
//        stats.put("HEALTH", 10);
        stats.put("CONSTITUTION", 7);
        stats.put("RANGED", 6);

        // update PUNCH attack value to (base value + 1/2 strength)
        attacks.put("PUNCH", (attacks.get("PUNCH") + (int) Math.round(0.5*stats.get("STRENGTH"))));

        position = new int[2];
        health = 10;

        // update health to (base value + 1/2 constitution)
        health += (int) Math.round(0.5 * stats.get("CONSTITUTION"));

        // update position to (1,1) starting
        position[0] = 1;
        position[1] = 1;
    }

    public int getHealth() {return health;}
    public int getStrength() {return stats.get("STRENGTH");}
    public int getKnowledge() {return stats.get("KNOWLEDGE");}
    public int getDexterity() {return stats.get("DEXTERITY");}
    public int getConstitution() {return stats.get("CONSTITUTION");}
    public int getRanged() {return stats.get("RANGED");}
    public void getBag() {
        for (String item: bag.keySet()){
            System.out.println(item);
        }
    }

    public void getPostition(){
        System.out.println(position[0] + "," + position[1]);
    }

    public void getAttacks() {
        for (String attack: attacks.keySet()){
            System.out.println(attack);
        }
    }
//    public int[] getPosition {return position;}
}
