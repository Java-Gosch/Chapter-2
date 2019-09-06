import java.util.Scanner;

public class NauticalMiles {
    public static void main(String[] args){

      double nauticalMiles;
      double nmilesInMiles;
      double nmilesInKilo;
      final double NMILES_TO_MILES = 1.150779;
      final double NMILES_TO_KILOS = 1.852;

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter Nautical Miles >>>");
      nauticalMiles = keyboard.nextDouble();

      nmilesInMiles = nauticalMiles * NMILES_TO_MILES;

      nmilesInKilo = nauticalMiles * NMILES_TO_KILOS;

      System.out.print("In " + nauticalMiles + " nautical miles, there are " + nmilesInMiles + " miles and " + nmilesInKilo + " kilometers");


    }

}
