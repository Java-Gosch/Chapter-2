import java.util.Scanner;

public class InchesToFeet {
    public static void main(String [] args){
        int inchesEntered;
        int numberOfFeet;
        int numberOfInches;
        final int INCHES_TO_FEET = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Number of Inches");
        inchesEntered = keyboard.nextInt();

        numberOfFeet = inchesEntered / INCHES_TO_FEET;

        numberOfInches = inchesEntered % INCHES_TO_FEET;

        System.out.print("In " + inchesEntered + " inches there are " + numberOfFeet + " feet and " + numberOfInches + )

    }
}
