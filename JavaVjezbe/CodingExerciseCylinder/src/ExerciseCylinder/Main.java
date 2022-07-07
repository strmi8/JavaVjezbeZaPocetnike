package ExerciseCylinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
	    System.out.println("Enter the circles radius: ");
		Circle circle = new Circle(scan.nextDouble());
		
		
		System.out.println("Circle.radius = " + circle.getRadius());
		System.out.println("Circle.area = " + circle.getArea());
		
		
		System.out.println("Enter cylinder radius and height: ");
		Cylinder cylinder = new Cylinder(scan.nextDouble(),scan.nextDouble());
		
		
		System.out.println("Cylinder.radius = " + cylinder.getRadius());
		System.out.println("Cylinder.height = " + cylinder.getHeight());
		System.out.println("Cylinder.area = " + cylinder.getArea());
		System.out.println("Cylinder.volume = " + cylinder.getVolume());

		scan.close();
	}

}
