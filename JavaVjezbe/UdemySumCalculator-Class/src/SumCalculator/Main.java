package SumCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("Unesite prvi broj: ");
        calculator.setFirstNumber(scan.nextDouble());
        System.out.println("Unesite drugi broj: ");
        calculator.setSecondNumber(scan.nextDouble());
        System.out.println("Rezultat zbrajanja: " + calculator.getAdditionResult());
        System.out.println("Rezultat oduzimanja: " + calculator.getSubtractionResult());
        System.out.println("Rezultat mnozenja: " + calculator.getMultiplicationResult());
        System.out.println("Rezultat dijeljenja: " + calculator.getDivisionResult());
        
    }
}
