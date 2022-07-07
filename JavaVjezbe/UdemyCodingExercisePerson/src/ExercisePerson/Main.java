package ExercisePerson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person client = new Person();

        System.out.println("Enter first name: ");
        client.setFirstName(scan.nextLine());
        System.out.println("Enter last name: ");
        client.setLastName(scan.nextLine());
        System.out.println("Enter age: ");
        client.setAge(scan.nextInt());

        System.out.println(client.getFullName() + " is " + client.getAge() + " years old.");
        System.out.println("Is the mentioned person a teenager ?: " + client.isTeen());

        scan.close();


    }
}
