package org.practice_DSA.tree;

public class diameter {
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
    public static int diameter(Node node,int[] max){
        if(node==null) return 0;

        int l=diameter(node.left, max);
        int r=diameter(node.right, max);
        max[0]=Math.max(max[0],r+l);

        return 1+Math.max(l,r);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(3);
        root.left.left.left=new Node(4);
        int[] max=new int[1];
        diameter(root,max);

        System.out.println("diameter of the BT:"+ max[0]);
    }
}
