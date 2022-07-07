package Exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.println(area(radius));
        System.out.println(area(x,y));

    }

    public static double area(double radius){
        if(radius < 0 ){
            return -1.0;
        } else {
            return (Math.PI * (radius * radius));
        }
    }

    public static double area(double x, double y){
        if (x<0 || y<0){
            return -1.0;
        } else {
         return x * y;
        }
    }
}
