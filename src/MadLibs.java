import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        String color;
        String wordEst;
        String bodyPart;
        String animalPet;
        String noun;
        String nounPlural;


        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color >>>");
        color = input.nextLine();
        System.out.print("Enter a word ending in EST >>>");
        wordEst = input.nextLine();
        System.out.print("Enter a body part >>>");
        bodyPart = input.nextLine();
        System.out.print("Enter an animal >>>");
        animalPet = input.nextLine();
        System.out.print("Enter a noun >>>");
        noun = input.nextLine();
        System.out.print("Enter a plural noun >>>");
        nounPlural = input.nextLine();


        System.out.println("The " + color + " Car is the " + wordEst + " Car of all and is fueled by " + bodyPart + ". " + animalPet + " went to " + noun + " and asked for a " + nounPlural);


        System.out.print("Enter a number >>>");
        a = input.nextInt();

        System.out.print("Enter another number >>>");
        b = input.nextInt();

        c = a%b;

    }
}
