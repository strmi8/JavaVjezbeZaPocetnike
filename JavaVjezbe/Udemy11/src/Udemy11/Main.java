package Udemy11;

public class Main {

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            getHighScore(score,levelCompleted,bonus);
        }


    }
    
    public static void getHighScore(int score,int levelCompleted, int bonus){
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Youre final score was " + finalScore);
    }
}

