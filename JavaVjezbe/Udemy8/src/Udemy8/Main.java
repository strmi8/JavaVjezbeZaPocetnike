package Udemy8;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();

    if(number > 0){
        System.out.println("entered number is positive");
    }
    else if (number < 0 ){
        System.out.println("entered number is negative");
    }
    else{
        System.out.println("entered number is 0");
    }

    System.out.println("Enter 3 integer numbers to be compared: ");

    int numberA = scan.nextInt();
    int numberB = scan.nextInt();
    int numberC = scan.nextInt();

    if(numberA>numberB && numberA>numberC){
        System.out.println("The greatest of the 3 entered numbers is: " + numberA);
    }
    else if(numberB>numberC && numberB>numberA){
        System.out.println("The greatest of the 3 entered numbers is: " + numberB);
    }
    else{
        System.out.println("The greatest of the 3 entered numbers is: " + numberC);
    }

    scan.close();
    }
}
