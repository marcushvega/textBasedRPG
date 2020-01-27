//import com.sun.java.util.jar.pack.Instruction;
import extra.MyToon;
import extra.DungeonMap;
import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        MyToon thisToon = new MyToon();
        DungeonMap thisDungeonMap = new DungeonMap();
        Scanner input = new Scanner(System.in);
        String menuIn = "";

        System.out.println("Your toon wakes up to a new world");
        System.out.println();

        do
        {
            System.out.println("What does your toon do?");
            System.out.println();
            System.out.println("    ~ Move");
            System.out.println("    ~ Info");
            System.out.println();
            menuIn = input.nextLine();
            if( menuIn == "Move"){
                System.out.println();
                System.out.println("Where do you want your toon to move?");
                System.out.println();
                System.out.println("    N ~ Move one room North");
                System.out.println("    E ~ Move one room East");
                System.out.println("    S ~ move one room South");
                System.out.println("    W ~ Move one room West");

                menuIn = input.nextLine();



            }   else if (menuIn == "Info") {
                System.out.println();
                System.out.println("What would you like to know about your toon?");
                System.out.println();
                System.out.println("    A ~ What is in my Bag?");
                System.out.println("    B ~ What are my Stats?");
                System.out.println("    C ~ What is my Current Health?");
                System.out.println("    D ~ What is my Position?");
                System.out.println("    E ~ What are my Attacks?");

                menuIn = input.nextLine();

                switch (menuIn)
                {
                    case "A":
                        thisToon.getBag();
                        break;
                    case "B":
                        System.out.println("Your toon's Strength is " + thisToon.getStrength());
                        System.out.println("Your toon's Dexterity is " + thisToon.getDexterity());
                        System.out.println("Your toon's Constitution is " + thisToon.getConstitution());
                        System.out.println("Your toon's Knowledge is " + thisToon.getKnowledge());
                        System.out.println("Your toon's ranged is " + thisToon.getRanged());
                        break;
                    case "C":
                        System.out.println("Your toon's Current Health is " + thisToon.getHealth());
                        break;
                    case "D":
                        System.out.print("Your toon's current location is ");
                        thisToon.getPostition();
                        break;
                    case "E":
                        thisToon.getAttacks();
                        break;
                    default:
                        System.out.println("Please choose a valid input ~ A,B,C,D,E");
                }
                System.out.println();
                System.out.println();
                System.out.println();
            }
        } while (true);

        // check toon details
            // check stats
            // check health
            // check items in bag
            // check attacks
            // check position (take out later)
    }
}
