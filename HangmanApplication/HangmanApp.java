package HangmanApplication;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApp {
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will "
                + "try to guess it character "
                + "by character."
                + "If you guess wrong 6 times, then I win.\nIf you can guess it before then, you win. "
                + "Are you ready? I hope so because I am.");

        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below "
                + "that is your current guess, which starts off as nothing. \nEvery time you "
                + "guess incorrectly. I add a body part to the picture. When there is a full"
                + " person, you lose.");
        
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            System.out.println();
            System.out.println("Alright lets play!");
            Hangman game = new Hangman();
            do { 
                System.out.println();
                System.out.println(game.drawPicture());
                
            } while (true);
        }
    }
}
