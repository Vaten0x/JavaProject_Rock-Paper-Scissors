import java.util.Scanner;

public class JavaAppproject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double rps;
        String Answer;
        int ans = 3;
        
        System.out.println("ROCK PAPER SCISSOR GAME");
        System.out.print("Type 'Rock' or 'Paper' or 'Scissors': ");
        Answer = keyboard.next().toUpperCase();
        
        switch(Answer) {
            case "ROCK":
                ans = 0;
                break;
            case "PAPER":
                ans = 1;
                break;
            case "SCISSORS":
                ans = 2;
                break;
        }
        
        if (ans == 3) {
            System.out.println("Haa you can't spell");
        } else {            
            System.out.print("Opponent: ");
            rps = Math.floor(Math.random()*3);
            if ( rps == 0 ) {
                System.out.println("ROCK");
            }
            else if ( rps == 1 ) {
                System.out.println("PAPER");
            }
            else if ( rps == 2 ) {
                System.out.println("SCISSORS");
            }
            
            if ( (ans == rps) ){
            System.out.println("Tie, no winners! ");
            }
            else if ( (ans == 0 && rps == 2) || (ans == 1 && rps == 0) || (ans == 2 && rps == 1) ){
                System.out.println("YOU WIN CONGRATULATIONS! ");
                System.out.println("You have earned the certificate of master Rock Paper Scissors game!");
            }
            else {
                System.out.println("You lost! How sad! ");
                System.out.println("Try again, I dare you!!! :) ");
            }
        }        
    }  
}
