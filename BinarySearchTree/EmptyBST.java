package BinarySearchTree;

public class EmptyBST<D extends Comparable> implements Tree<D> {
    public EmptyBST() {

     } // Constructor (does nothing since this is an empty tree)

    public boolean isEmpty() {
         return true; 
    } // Always returns true for an empty tree

    public int cardinality() {
         return 0; 
    } // The cardinality of an empty tree is 0

    public boolean member(D elt) {
         return false; 
    } // Empty tree can't contain any elements

    public NonEmptyBST<D> add(D elt) {
         return new NonEmptyBST<D>(elt);
    } // Adding an element creates a new NonEmptyBST
}
