package Exercise7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean summer = false;
        int temperature = scan.nextInt();
        System.out.println(isCatPlaying(summer,temperature));
        scan.close();

    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if( summer == true && temperature > 25 && temperature <= 45){
            return true;
        } else if (summer == false && temperature > 25 && temperature <= 35){
            return true;
        } else {
            return false;
        }
    }
}
