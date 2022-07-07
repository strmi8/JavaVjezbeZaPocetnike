package Udemy6;

public class Main {
    public  static void main(String[] args){
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar + " " + myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        if(myFalseBooleanValue==false){
            System.out.println("if- statement passed");
        }
        System.out.println(myTrueBooleanValue + " " + myFalseBooleanValue);

    }
}
