import java.util.Scanner;


public class DataTypes {


    public static void main(String [] args){
        int Gamers = 5;
        int monkeysEntered;
        int barrel;
        System.out.println("Number of Gamers = " + Gamers);

        barrel = Gamers;

        System.out.println("Number of Gamers in the barrel = " + barrel);
        System.out.println("How many more Gamers do you want to add to the barrel? >>>");
        Scanner inputDevice = new Scanner(System.in);
        monkeysEntered = inputDevice.nextInt();

        barrel = Gamers + monkeysEntered;

        System.out.println("There are now " + barrel + " Gamers in the barrel");
        barrel = barrel/(1 +(int) (Math.random() *10));
        System.out.println("Due to suicide you killed half of the Gamers\n" +
        "There are now only " + barrel + " Gamers left in the barrel SAD! by a XXXTENTACION");
    }
}
