import java.util.Random;
import java.util.Scanner;

public class FindNumber{

    public static void main(String[] args) {

        Random generatnumber = new Random ();
        int numberchosen = generatnumber.nextInt(100);
        int numberinsered = 0;
        int numberoftry = 0;

            while (numberinsered != numberchosen) {
                System.out.println("Entrez un chiffre entre 0 et 100:");
                Scanner scannumber = new Scanner(System.in);
                numberinsered = scannumber.nextInt(); 
                numberoftry++;

                if (numberinsered > numberchosen) {
                    System.out.println("votre chiffre est plus grand !");   

                } else {
                    System.out.println("votre chiffre est plus petit !");
                    
                }
        

            }

            System.out.println("Bravo, vous avez deviné le chiffre" + "en " + numberoftry + "essais");
    }
}