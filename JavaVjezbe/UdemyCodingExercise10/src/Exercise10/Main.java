package Exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
        scan.close();

    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        } else {
            int firstNum = 0;
            int lastNum = number % 10;
            while(number != 0){
                if((number / 10 == 0 )){
                    firstNum = number;
                }
                number /= 10;
            }
            return firstNum + lastNum;
        }
    }
}
