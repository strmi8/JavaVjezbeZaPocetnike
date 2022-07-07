package Udemy7;

public class Main {

    public static void main(String[] args){
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " , this has been added.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

    }
}
