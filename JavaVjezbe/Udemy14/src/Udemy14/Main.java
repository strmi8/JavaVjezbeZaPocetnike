package Udemy14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int number ){
        if(number>0){
            System.out.println("positive");
        } else if(number==0){
            System.out.println("Is equal to 0");
        } else{
            System.out.println("negative");
        }
    }
}
