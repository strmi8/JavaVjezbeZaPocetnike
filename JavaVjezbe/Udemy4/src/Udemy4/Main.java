package Udemy4;

public class Main {
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min value of a float number is : "+ myMinFloatValue);
        System.out.println("Max value of a float number is : "+ myMaxFloatValue);

        double myMinDoubleValue = Float.MIN_VALUE;
        double myMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Min value of a double number is : "+ myMinDoubleValue);
        System.out.println("Max value of a double number is : "+ myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.250456F;
        float myFloatValue2 = (float) 5.2503;
        float myFloatValue3 = 5;
        double myDoubleValue = 5.252530D;
        double myDoubleValue2 = 5.25;
        System.out.println("Value of an Integer number: "+myIntValue);
        System.out.println("Value of a float number: "+myFloatValue);
        System.out.println("Value of a float2 number: "+myFloatValue2);
        System.out.println("Value of a double number: "+myDoubleValue);
        System.out.println("Value of a double2 number: "+myDoubleValue2);
        System.out.println("Value of a float3 number: "+myFloatValue3);

        float divisionOfFloats = 5f / 3f;
        double divisionOfDoubles = 5d / 3d;
        System.out.println("Value of float divisions is: "+ divisionOfFloats);
        System.out.println("Value of double divisions is: "+ divisionOfDoubles);
    }
}
