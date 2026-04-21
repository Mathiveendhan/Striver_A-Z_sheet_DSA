package org.practice_DSA.tree;

public class balanceBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int value){
            this.data=value;
            this.left=null;
            this.right=null;
        }
    }
    public static int balanceBinaryTree(Node root){
        if(root==null) return 0;

        int l=balanceBinaryTree(root.left);
        int r=balanceBinaryTree(root.right);
        if(Math.abs(l-r)>1){
            return -1;
        }
        if(l==-1 || r==-1) return -1;
        return 1+Math.max(l,r);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.left.left=new Node(4);

        System.out.println("balance Binary Tree:"+ (balanceBinaryTree(root)==-1));
    }
}
