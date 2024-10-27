package BinarySearchTree;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D data; // Root node value
    Tree<D> left; // Left subtree
    Tree<D> right; // Right subtree

    public NonEmptyBST(D elt) { // Constructor for a single-node tree
        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) { // Constructor for a tree with subtrees
        data = elt;
        left = leftTree;
        right = rightTree;
    }

    public boolean isEmpty() {
         return false; 
    } // Non-empty tree is never empty

    public int cardinality() {
         // Recursive node count
        return 1 + left.cardinality() + right.cardinality();
    }

    public boolean member(D elt) { // Recursive search
        if (data.equals(elt)) { // Found the element
            return true;
        } else if (elt.compareTo(data) < 0) { // Search left subtree
            return left.member(elt);
        } else { // Search right subtree
            return right.member(elt);
        }
    }

    public NonEmptyBST<D> add(D elt) { // Recursive add
        if (data.equals(elt)) { // If already present, return the same tree
            return this;
        } else if (elt.compareTo(data) < 0) { // Add to the left subtree
            return new NonEmptyBST<>(data, left.add(elt), right);
        } else { // Add to the right subtree
            return new NonEmptyBST<>(data, left, right.add(elt));
        }
    }
}

    
}
