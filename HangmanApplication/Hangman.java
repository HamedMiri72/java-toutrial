package HangmanApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {
    
    String mysterWord;
    StringBuilder currentGuss;
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    public Hangman() throws IOException {
        initializeStreams();
        mysterWord = pickWord();
        currentGuss = initializeCurrentGuess();
    }

    public StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i= 0; i<mysterWord.length() * 2 ; i++){
            if (i % 2 == 0 ){
                current.append("_");
            } else {
                current.append(" ");
            }
        }
        return current;
    }

    public String pickWord() {
       Random rand = new Random();
       int wordIndex = Math.abs(rand.nextInt()) % dictionary.size();
       return dictionary.get(wordIndex);
    }

    public void initializeStreams() throws IOException {
       try {
           File inFile = new File("dictionary.txt");
           fileReader = new FileReader(inFile);
           bufferedReader = new BufferedReader(fileReader);
           String currentLine = bufferedReader.readLine();
           while (currentLine != null) {
            dictionary.add(currentLine);
            currentLine = bufferedReader.readLine();
           }
           bufferedReader.close();
           fileReader.close();
       } catch (IOException e) {
        System.out.println("could not init streams!");
       }
    }

    public String getFormalCurrentGuess(){
        return "current Guess: " + currentGuss.toString();
    }

    public boolean gameOver() {
        if (didWeWin()) {
            System.out.println();
            System.out.println("Congrats! You won! You guessed the right word!");
            return true;
        } else if (didWeLose()) {
            System.out.println();
            System.out.println("Sorry, you lost. You spent all of your 6 tries. "
                    + "The word was " + mysteryWord + ".");
            return true;
        }
        return false;
    }

    private boolean didWeLose() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'didWeLose'");
    }

    private boolean didWeWin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'didWin'");
    }

}
