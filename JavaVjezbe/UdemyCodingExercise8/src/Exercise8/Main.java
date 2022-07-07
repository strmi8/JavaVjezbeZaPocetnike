package Exercise8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short month = scan.nextShort();
        short year = scan.nextShort();
        System.out.println(getDaysInMonth(month,year));
        scan.close();
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        } else if((year % 4 == 0 && year % 100 != 0)  || (year % 4 == 0 && year % 100 == 0  && year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }


    public static int getDaysInMonth(short month,short year){
        if(month < 1 || month > 12){
            return -1;
        }
        if(year < 1 || year > 9999){
            return -1;
        }
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }
}



