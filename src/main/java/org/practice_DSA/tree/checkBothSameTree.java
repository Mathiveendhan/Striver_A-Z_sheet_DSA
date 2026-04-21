package org.practice_DSA.tree;

public class checkBothSameTree {
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

    public static boolean checkSameTree(Node r1,Node r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.data !=r2.data) return false;
        return checkSameTree(r1.left, r2.left) && checkSameTree(r1.right, r2.right);
    }
    public static void main(String[] args) {
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.left.left=new Node(7);
        root1.left.left.left=new Node(4);

        Node root2=new Node(1);
        root2.left=new Node(2);
        root2.left.left=new Node(3);
        root2.left.left.left=new Node(4);

        System.out.println("Both are same tree:"+(checkSameTree(root1,root2)));
    }
}
