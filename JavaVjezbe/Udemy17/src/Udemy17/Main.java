package Udemy17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int minutes = scan.nextInt();
        int seconds = scan.nextInt();
        int seconds2 = scan.nextInt();
        System.out.println(getDurationString(minutes,seconds));
        System.out.println(getDurationString(seconds2));
        scan.close();

    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        } else {
            int hours = minutes / 60;
            minutes = minutes % 60;
            return (hours +" h " + minutes + " m " + seconds + " s ");
        }
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes,seconds);
        }
    }
}
