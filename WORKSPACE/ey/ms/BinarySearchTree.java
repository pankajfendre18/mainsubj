package com.ey.ms;

class Node2 {
    int data;
    Node2 left, right;

    public Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

// Binary Search Tree Implementation
class BST {
    Node2 root;

    // Insert a new Node2
    public Node2 insert(Node2 root, int key) {
        if (root == null) {
            return new Node2(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Search for a Node2
    public boolean search(Node2 root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    // Inorder Traversal (Left -> Root -> Right)
    public void inorder(Node2 root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert Node2s
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Print BST in Inorder (Sorted Order)
        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        // Search for a Node2
        int key = 40;
        if (tree.search(tree.root, key)) {
            System.out.println("Node2 " + key + " found in BST.");
        } else {
            System.out.println("Node2 " + key + " not found in BST.");
        }
    }
}