package org.practice_DSA.tree;

public class maximumPathSum {
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

    public static int maximumPathSum(Node root,int[] max){
        if(root==null) return 0;

        int l=Math.max(0,maximumPathSum(root.left,max));
        int r=Math.max(0,maximumPathSum(root.right,max));

        max[0]=Math.max(max[0],l+r+root.data);

        return Math.max(l,r)+root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(2);
        root.right = new Node(10);

        root.left.left = new Node(20);
        root.left.right = new Node(1);

        root.right.right = new Node(-25);

        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        int[] max=new int[1];
        maximumPathSum(root,max);
        System.out.println(max[0]);

    }
}
