package Exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isBarking = false;
        int hourOfTheDay = scan.nextInt();
        System.out.println(shouldWakeUp(isBarking,hourOfTheDay));
        scan.close();
    }

    public static boolean shouldWakeUp(boolean isBarking,int hourOfTheDay){
        if(hourOfTheDay < 0 || hourOfTheDay > 23){
            return false;
        } else if( isBarking == true && (hourOfTheDay < 8 || hourOfTheDay > 22)){
            return true;
        } else {
            return false;
        }
    }
}
