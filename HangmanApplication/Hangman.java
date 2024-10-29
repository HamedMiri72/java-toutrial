package HangmanApplication;

import java.io.BufferedReader;
import java.io.FileReader;
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
    
}
