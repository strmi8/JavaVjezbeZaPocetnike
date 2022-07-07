package InputChallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;
        int counter = 0;
        boolean isAnInt;


        while (i < 10){
            System.out.println("Enter number " + (i+1) +".");
            isAnInt = scan.hasNextInt();
            if(isAnInt) {
                counter += scan.nextInt();
                i++;
            } else {
                System.out.println("Invalid input");
            }
            scan.nextLine();
        }

        scan.close();
        System.out.println("The sum of entered numbers is: " + counter);
    }
}
