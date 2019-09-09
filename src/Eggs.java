import java.util.Scanner;

public class Eggs {
    public static void main(String [] args){
        int eggsEntered;
        int eggsDozen;
        int eggsLeft;
        double looseCost;
        double dozenCost;
        double totalCost;
        final double DOZEN_EGGS_COST = 3.25;
        final double LOOSE_EGGS_COST = 0.45;
        final int EGGS_IN_DOZEN = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many eggs are you going to buy?");
        eggsEntered = keyboard.nextInt();

        eggsDozen = eggsEntered / EGGS_IN_DOZEN;
        eggsLeft = eggsEntered % EGGS_IN_DOZEN;

        dozenCost = eggsDozen + DOZEN_EGGS_COST;
        looseCost = eggsLeft + LOOSE_EGGS_COST;
        totalCost = looseCost + dozenCost;

        System.out.print("You've bought " + eggsEntered + " eggs. That's " + eggsDozen + " dozen eggs at the cost of $3.25 and have " + eggsLeft + " eggs left over costing $0.45 each making your total " + totalCost);




    }

}
