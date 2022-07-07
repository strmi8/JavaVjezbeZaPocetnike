package Udemy9;

public class Main {
    public static void main(String[] args){
        double num1 = 20.00d;
        double num2 = 80.00d;


        double result = num1 + num2 * 100.00d; //ako stavimo num1 i num2 u zagrade onda nema ostatka
        System.out.println("Result is: " + result);

        double remainder = result % 40.00d;
        System.out.println("Remainder is:  " + remainder);

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder is: " + isNoRemainder);

        if(isNoRemainder==false){
            System.out.println("Got some remainder");
        }
    }
}
