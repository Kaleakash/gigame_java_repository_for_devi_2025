package com;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
    void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    int height(TreeNode root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

}

public class SimpleTreeDsaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);	// root is ready 		1
		root.left=new TreeNode(2);		// 				2				3
		root.right=new TreeNode(3);		//			4		5		6		7			
		root.left.left=new TreeNode(4);	//											
		root.left.right=new TreeNode(5);	//
		root.left.left.left=new TreeNode(8);	//											
		root.left.right.right=new TreeNode(9);	//
		root.right.left=new TreeNode(6);							
		root.right.right=new TreeNode(7);
		root.inorder(root);
		System.out.println();
		root.preorder(root);
		System.out.println();
		root.postorder(root);
		System.out.println();
		System.out.println("Hight of the tree "+root.height(root));
	}

}
