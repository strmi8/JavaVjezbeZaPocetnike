package Udemy13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        sumOfDigits(number);
        scan.close();

    }

    public static void sumOfDigits(int number){
        int sumOfDigits=0;
        while(number!=0){
            sumOfDigits += number % 10;
            number = number / 10;
        }
        System.out.println("Sum of digits is: " + sumOfDigits);
    }
}
