package Udemy3;

public class Main {
    public static void main(String[] args){

        byte num1 = 100;
        short num2 = 600;
        int num3 = 100000;
        long num4 = 50000L + 10L * (long)(num1+num2+num3);

        System.out.println("Value of the byte number is: "+num1);
        System.out.println("Value of the short number is: "+num2);
        System.out.println("Value of the integer number is: "+num3);
        System.out.println("Value of the long number is: "+num4);

    }

}
