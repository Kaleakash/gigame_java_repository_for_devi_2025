package com;
class BinarySearch{
	int data;
	BinarySearch left,right;
	BinarySearch(int data){
		this.data=data;
		
	}
}
class BinarySearchTree {
	BinarySearch insert(BinarySearch root, int key) {
	    if (root == null) return new BinarySearch(key);
	    if (key < root.data)
	        root.left = insert(root.left, key);
	    else if (key > root.data)
	        root.right = insert(root.right, key);
	    return root;
	}

	boolean search(BinarySearch root, int key) {
	    if (root == null) return false;
	    if (root.data == key) return true;

	    if (key < root.data)
	        return search(root.left, key);
	    else
	        return search(root.right, key);
	}

}
public class BinarySearchTreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		BinarySearch root = new BinarySearch(10);
			bst.insert(root, 10);							// root --> 10 
		BinarySearch child1 = new BinarySearch(3);
		BinarySearch child2 = new BinarySearch(1);
		BinarySearch child3 = new BinarySearch(11);
		BinarySearch child4 = new BinarySearch(15);
		BinarySearch child5 = new BinarySearch(6);
		BinarySearch child6 = new BinarySearch(9);
		bst.insert(child1, 3);
		bst.insert(child2, 1);
		bst.insert(child3, 11);
		bst.insert(child4, 15);
		bst.insert(child5, 6);
		bst.insert(child6, 7);
		boolean result = bst.search(root,10);
		System.out.println(result);
	}

}
