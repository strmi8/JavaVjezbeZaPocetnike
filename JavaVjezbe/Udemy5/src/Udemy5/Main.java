package Udemy5;

import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        double pounds = 200d;
        double equalKilogram = 0.45359237d;
        double poundsToKilogram = pounds * equalKilogram;
        System.out.println("Result from converting " + pounds + " pounds to kg is: "+ poundsToKilogram + " kgs.");

    }
}
