package Udemy12;

public class Main {

    public static void main(String[] args){

        String playerName = "Strmi";
        String playerName2 = "Strmac";
        String playerName3 = "Rvoje";
        byte position = 3;
        int playerScore = 170;

        displayHighScorePosition(playerName,position);
        displayHighScorePosition(playerName2,(byte)1);
        displayHighScorePosition(playerName3,(byte)2);
        System.out.println(calculateHighScorePosition(playerScore));


    }

    public static void displayHighScorePosition(String playerName, byte position){
        System.out.println(playerName + " managed to get into position " + position + ". on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
       if (playerScore >= 1000){
           return 1;
       } else if (playerScore >= 500){
           return 2;
       } else if (playerScore >= 100) {
           return 3;
       } else {
           return 4;
       }

    }
}
