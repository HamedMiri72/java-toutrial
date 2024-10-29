package HangmanApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

    private StringBuilder initializeCurrentGuess() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'initializeCurrentGuess'");
    }

    private String pickWord() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pickWord'");
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

}
