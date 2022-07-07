package Exercise6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long minutes = scan.nextLong();
        printYearsAndDays(minutes);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600l;
            long restminutes = minutes % 525600l;
            long days = restminutes / 1440l;
            System.out.println(minutes + " minutes =  " + years + " years and " + days + " days.");
        }
    }
}
