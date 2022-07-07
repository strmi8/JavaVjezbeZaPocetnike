package Udemy20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(sumDigits(number));
        scan.close();
    }

    public static int sumDigits(int number){
        int sumOfDigits = 0;
        if(number < 10){
           return -1;
        } else {
             while(number != 0){
                 sumOfDigits += number % 10;
                 number /= 10;
             }
             return sumOfDigits;
        }
    }


}
