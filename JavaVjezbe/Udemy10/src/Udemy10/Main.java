package Udemy10;

public class Main {

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 200;

/*        if(score < 5000 && score > 1000) {
            System.out.println("your score was less than 5000 but greated than 1000");
        } else if(score < 1000){
            System.out.println("your score was less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was: " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(gameOver){
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("your final score wa: " + finalScore);
        }




    }
}
