package BinarySearchTree;

public interface Tree<D extends Comparable> {
    public boolean isEmpty();         // Check if the tree is empty
    public int cardinality();         // Count the number of elements in the tree
    public boolean member(D element); // Check if an element is in the tree
    public NonEmptyBST<D> add(D elt); // Add a new element and return the updated tree
}
