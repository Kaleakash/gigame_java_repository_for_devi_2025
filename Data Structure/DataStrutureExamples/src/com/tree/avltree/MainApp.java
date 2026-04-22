package com.tree.avltree;

class AVLNode {

    int key;           // Stores marks (used for ordering)
    String name;       // Stores student name
    int height;        // Height of node (used for balancing)

    AVLNode left;      // Left child
    AVLNode right;     // Right child

    public AVLNode(int key, String name) {
        this.key = key;        // Initialize key
        this.name = name;      // Initialize name
        this.height = 1;       // New node is leaf → height = 1
        this.left = null;      // No left child initially
        this.right = null;     // No right child initially
    }
}



class AVLTree  {

    AVLNode root;   // Root of AVL Tree

    // Function to get height of a node
    int height(AVLNode node) {
        return (node == null) ? 0 : node.height; // Null → 0, else return height
    }

    // Function to calculate balance factor
    int getBalance(AVLNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
        // Positive → left heavy, Negative → right heavy
    }

    // Right Rotation (fixes Left-Left imbalance)
    AVLNode rightRotate(AVLNode y) {

        AVLNode x = y.left;     // Left child becomes new root
        AVLNode T2 = x.right;   // Store subtree

        // Perform rotation														// 1,4,5		10		15
        x.right = y;															// 1,4		5		10,15
        y.left = T2;

        // Update heights after rotation
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // Return new root
    }

    // Left Rotation (fixes Right-Right imbalance)
    AVLNode leftRotate(AVLNode x) {

        AVLNode y = x.right;    // Right child becomes new root
        AVLNode T2 = y.left;    // Store subtree

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights after rotation
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // Return new root
    }

    // Insert node into AVL Tree
    AVLNode insert(AVLNode node, int key, String name) {

        // Step 1: Perform normal BST insertion
        if (node == null)
            return new AVLNode(key, name); // Create new node

        if (key < node.key)
            node.left = insert(node.left, key, name); // Go left
        else if (key > node.key)
            node.right = insert(node.right, key, name); // Go right
        else
            return node; // Duplicate not allowed

        // Step 2: Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Step 3: Get balance factor
        int balance = getBalance(node);

        // Step 4: Handle imbalance using rotations

        // Case 1: Left Left (LL)
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Case 2: Right Right (RR)
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Case 3: Left Right (LR)
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left); // First rotate left
            return rightRotate(node);          // Then rotate right
        }

        // Case 4: Right Left (RL)
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right); // First rotate right
            return leftRotate(node);              // Then rotate left
        }

        return node; // Return updated node
    }

    // Search node
    AVLNode search(AVLNode node, int key) {

        if (node == null || node.key == key)
            return node; // Found or not present

        if (key < node.key)
            return search(node.left, key); // Search left

        return search(node.right, key); // Search right
    }

    // Inorder traversal (prints sorted data)
    void inorder(AVLNode node) {

        if (node != null) {
            inorder(node.left); // Visit left subtree

            System.out.println(node.key + " - " + node.name); // Print node

            inorder(node.right); // Visit right subtree
        }
    }
}


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AVLTree tree = new AVLTree(); // Create AVL Tree

        // Insert student data (marks, name)
        tree.root = tree.insert(tree.root, 85, "Amit");
        tree.root = tree.insert(tree.root, 70, "Rahul");
        tree.root = tree.insert(tree.root, 90, "Neha");
        tree.root = tree.insert(tree.root, 60, "Priya");
        tree.root = tree.insert(tree.root, 75, "Karan");
        tree.root = tree.insert(tree.root, 95, "Sneha");

        // Display sorted leaderboard
        System.out.println("Student Ranking (Sorted Order):");
        tree.inorder(tree.root);

        // Search example
        System.out.println("\nSearching for key = 75");

        AVLNode result = tree.search(tree.root, 75);

        if (result != null)
            System.out.println("Found: " + result.name);
        else
            System.out.println("Not Found");
    }


}
