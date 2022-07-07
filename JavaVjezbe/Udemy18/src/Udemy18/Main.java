package Udemy18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char character = 'B';
        switch (character){

            case 'A':
                System.out.println("Value of the character is A");
                break;
            case 'B':
                System.out.println("Value of the character is B");
                break;
            case 'C':
                System.out.println("Value of the character is C");
                break;
            case 'D':
                System.out.println("Value of the character is D");
                break;
            case 'E':
                System.out.println("Value of the character is E");
                break;
            default:
                System.out.println("Value is not A,B,C,D,E");
                break;

        }
    }
}
