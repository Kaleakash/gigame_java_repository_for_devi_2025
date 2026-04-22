package com.avl;

class Node {
    int data, height;
    Node left, right;

    Node(int data) {
        this.data = data;
        height = 1;
    }
}

public class AVLTree {

    Node root;

    // Get height
    int height(Node n) {
        return n == null ? 0 : n.height;
    }

    // Get balance factor
    int getBalance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    // Right Rotation (LL)
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation (RR)
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert with balancing
    Node insert(Node node, int key) {

        if (node == null)
            return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node;

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL Case
        if (balance > 1 && key < node.left.data)
            return rightRotate(node);

        // RR Case
        if (balance < -1 && key > node.right.data)
            return leftRotate(node);

        // LR Case
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
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

        AVLTree tree = new AVLTree();

        int[] values = {10, 20, 30, 40, 50, 25};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("Inorder Traversal (Balanced BST):");
        tree.inorder(tree.root);
    }
}

