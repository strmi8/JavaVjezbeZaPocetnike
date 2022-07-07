package Exercise4;
//leap year.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(isLeapYear(year));
        scan.close();
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999 ){
            return false;
        } else {
            if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
                return true;
            } else {
                return false;
            }
        }
    }
}
