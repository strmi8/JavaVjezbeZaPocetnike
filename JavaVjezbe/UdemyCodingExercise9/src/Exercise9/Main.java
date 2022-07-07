package Exercise9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println("Sum of all odd numbers between entered numbers is: " + sumOdd(start,end));
        scan.close();
    }

        public static boolean isOdd(int number){
        if(number < 0){
            return false;
        } else if(number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

        public static int sumOdd(int start, int end) {
            if (start > end || start <= 0 || end <= 0) {
                return -1;
            } else {
                int counter = 0;
                for (int i = start; i <= end; i++) {
                    if (isOdd(i)) {
                        counter += i;
                    }
                }
                return counter;
            }
        }
}
