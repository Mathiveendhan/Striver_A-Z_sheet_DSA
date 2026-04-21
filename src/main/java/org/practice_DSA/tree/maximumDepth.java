package org.practice_DSA.tree;

public class maximumDepth {
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
    public static int depth(Node root){
        if(root==null) return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        return 1+Math.max(r,l);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.left.left=new Node(4);

        System.out.println(depth(root));
    }
}
