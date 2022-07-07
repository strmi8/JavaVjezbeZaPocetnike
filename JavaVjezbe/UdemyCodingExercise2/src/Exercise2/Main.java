package Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kiloBytes = scan.nextInt();
        printMegaBytesAndKiloBytes(kiloBytes);
        scan.close();

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int xx; //megbytes
            int yy; //kilobytes
            //1MB = 1024KB
            xx = kiloBytes / 1024;
            yy = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + xx + " MB and " + yy + " KB" );
        }
    }

}
