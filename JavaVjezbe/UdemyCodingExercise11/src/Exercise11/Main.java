package Exercise11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenSumAndAverage();

    }

    public static void inputThenSumAndAverage(){
        Scanner scan = new Scanner(System.in);

        int brojac = 1;
        int sum = 0;
        long average = 0L;

        while(true){

            System.out.println("Enter " + brojac + ". number: he");

            boolean hasNextInt = scan.hasNextInt();

            if(hasNextInt){
                int broj = scan.nextInt();
                sum +=broj;
                brojac++;
            } else {
                average = Math.round((double) sum / brojac);
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scan.close();
    }
}
