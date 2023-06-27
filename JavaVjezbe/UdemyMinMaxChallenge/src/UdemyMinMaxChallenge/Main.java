package UdemyMinMaxChallenge;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;
        int temp;
        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scan.hasNextInt();
            if(isAnInt) {
                temp = scan.nextInt();
                if (first) {
                    minValue = temp;
                    maxValue = minValue;
                    first = false;
                }
                if(temp > maxValue){
                    maxValue = temp;
                }
                if(temp < minValue){
                    minValue = temp;
                }
                scan.nextLine();
            } else {
                break;
            }
        }
        System.out.println("Min value of entered numbers is: " + minValue);
        System.out.println("Max value of entered numbers is: " + maxValue);
    }
}
