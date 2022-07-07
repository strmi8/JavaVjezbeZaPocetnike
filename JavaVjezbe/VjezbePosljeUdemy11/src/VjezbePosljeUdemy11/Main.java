package VjezbePosljeUdemy11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        getSmallest(num1,num2,num3);
        getAverage(num1,num2,num3);
        scan.close();

    }

    public static void getSmallest(double num1, double num2, double num3){
        if(num1<num2 && num1<num3){
            System.out.println("The smallest is the first number entered");
        } else if (num2<num1 && num2<num3){
            System.out.println("The smallest is the second number entered");
        } else {
            System.out.println("The smallest is the third number entered");
        }
    }

    public static void getAverage(double num1, double num2, double num3){
        System.out.println("The average number from all inserted numbers is: " + (num1+num2+num3)/3);
    }

    
}
