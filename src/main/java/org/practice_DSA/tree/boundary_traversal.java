package org.practice_DSA.tree;

import java.util.*;

public class boundary_traversal {

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

    public static boolean checknode(Node node){
        return node.left == null && node.right == null;
    }
    public static void leftBoundary( ArrayList<Integer> arr,Node root){
        Node node=root;
        while(node!=null){
            if(!checknode(node)){
                arr.add(node.data);
            }
            if(node.left!=null){
                node=node.left;
            }else{
                node=node.right;
            }
        }
    }

    public static void leafNode(Node root,ArrayList<Integer> arr ){
        if (root == null) return;

        if(checknode(root)) {
            arr.add(root.data);
            return;
        }
        leafNode(root.left,arr);
        leafNode(root.right,arr);
    }

    public static void rightBoundary(Node node,ArrayList<Integer> arr){
        ArrayList<Integer> ar=new ArrayList<>();
        while(node!=null){
            if(!checknode(node)){
                ar.add(node.data);
            }
            if(node.right!=null){
                node=node.right;
            }else{
                node=node.left;
            }
        }
        for(int i=ar.size()-1;i>=0;i--){
            arr.add(ar.get(i));
        }
    }

    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
             / \     \
            4   5     6
               / \   /
              7   8 9
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);

        root.right.right.left = new Node(9);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.data);
        leftBoundary(arr,root.left);
        leafNode(root,arr);
        rightBoundary(root.right,arr);



        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
