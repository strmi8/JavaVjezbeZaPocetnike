package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double kilometersPerHour = scan.nextDouble();
        System.out.println(toMilesPerHour(kilometersPerHour));
        printConversion(kilometersPerHour);
        scan.close();
    }

    public static long toMilesPerHour(double kilometersPerHour){
        int sum;
        if(kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        } else {
            double sum = kilometersPerHour / 1.609;
            System.out.println(kilometersPerHour + " km/h = " + sum + " mi/h");
        }
    }
}
