package com.tree.basictree;


class EmployeeNode {
    String name;
    EmployeeNode left;   // Left subordinate
    EmployeeNode right;  // Right subordinate

    public EmployeeNode(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
}


public class CompanyHierarchyTree {

	EmployeeNode root;



    // Preorder traversal (useful for cloning or saving structure)
    public void preorder(EmployeeNode node) {
        if (node == null)
            return;

        System.out.print(node.name + " -> ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {

        CompanyHierarchyTree company = new CompanyHierarchyTree();

        // Creating company structure
        company.root = new EmployeeNode("CEO");

        company.root.left = new EmployeeNode("CTO");
        company.root.right = new EmployeeNode("CFO");

        company.root.left.left = new EmployeeNode("Dev Manager");
        company.root.left.right = new EmployeeNode("QA Manager");

        company.root.right.left = new EmployeeNode("Finance Manager");
        company.root.right.right = new EmployeeNode("Accounts Manager");

       
        System.out.print("\nPreorder Traversal: ");
        company.preorder(company.root);
    }


}
