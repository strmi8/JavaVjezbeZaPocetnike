package Udemy15;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim",500);
        int newScore1 = calculateScore(600);
        System.out.println("New score is: " + newScore);
        calculateScore();

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player scored " + score +" points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name no player score.");
        return 0;
    }
}
