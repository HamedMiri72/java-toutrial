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

    public static void checkIsEmpty(Tree t) throws Exception{
        if (t instanceof EmptyBST && !t.isEmpty()){
            throw new Exception("Empty tree is not empty");
        }else if (t instanceof NonEmptyBST && t.isEmpty()){
            throw new Exception("Non-empty tree is empty");
        }

    }

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        if (nT == (t.cardinality() + 1) && t.member(x)) {
            throw new Exception("Tree cardinality should increase, but element was already present.");
        } else if (nT == t.cardinality() && !t.member(x)) {
            throw new Exception("Cardinality unchanged, but element is missing.");
        }
    }
    
}
