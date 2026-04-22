package com.tree.bst;

class BST {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    // Insert Node
    Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Search Node
    boolean search(Node root, int key) {

        if (root == null)
            return false;

        if (key == root.data)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Find Minimum
    int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Delete Node
    Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {

            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two children
            int minValue = findMin(root.right);
            root.data = minValue;
            root.right = delete(root.right, minValue);
        }

        return root;
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        BST tree = new BST();

        int[] values = {100, 30, 70, 20, 40, 120,60, 80};							// 100
        																	// 		30 			120
        																	//20	 	 70
        																//			  40				
        for (int val : values) {										//					60
        																//							80
            tree.root = tree.insert(tree.root, val);		// 50 is root
        }													// left node values 30,20,40
        													// right node value : 70,60
        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 70: " + tree.search(tree.root, 70));

        tree.root = tree.delete(tree.root, 30);

        System.out.print("After Deletion: ");
        tree.inorder(tree.root);
    }
}

