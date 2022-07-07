package Udemy16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double feet = scan.nextDouble();
        double inches = scan.nextDouble();
        double centimeters = calcFeetAndInchesToCentimeters(feet,inches);
        calcFeetAndInchesToCentimeters(157);
        scan.close();
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if( feet < 0 || inches < 0 || inches > 12 ){
            System.out.println("Invalid Value entered");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("Invalid Value entered");
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
    }
}
