package BinarySearchTree;

import java.util.Random;

public class Testers {

    public static int rndInt(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    
    public static Tree rndTree(int count) { // Create a random tree with 'count' elements
        if (count == 0) {
            return new EmptyBST();
        } else {
            return rndTree(count - 1).add(rndInt(0, 50));
        }
    }

    
    
}
