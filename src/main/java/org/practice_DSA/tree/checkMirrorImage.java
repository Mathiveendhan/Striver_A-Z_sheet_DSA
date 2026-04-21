package org.practice_DSA.tree;

public class checkMirrorImage {
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

    public static boolean mirrorCheck(Node r1,Node r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.data!=r2.data) return false;

        return mirrorCheck(r1.left, r2.right) && mirrorCheck(r1.right, r2.left);

    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.left.left = new Node(2);
        root1.left.right = new Node(5);
        root1.left.right.right = new Node(4);

        Node root2 = new Node(1);
        root2.right = new Node(3);
        root2.right.right = new Node(2);
        root2.right.left = new Node(5);
        root2.right.left.left = new Node(4);


        System.out.println("Mirror checking:" + (mirrorCheck(root1, root2)));
    }
}
