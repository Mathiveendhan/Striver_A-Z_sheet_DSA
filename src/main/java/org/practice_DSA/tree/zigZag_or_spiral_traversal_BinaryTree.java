package org.practice_DSA.tree;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int value){
        this.data=value;
        this.left=null;
        this.right=null;
    }
}

public class zigZag_or_spiral_traversal_BinaryTree {

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        int i=0,j=arr.size()-1;
        while(i<j){
            int n=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,n);
            i++;
            j--;
        }
        return arr;
    }

    public static void call(ArrayList<ArrayList<Integer>> ans,Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int count=0;

        while(!q.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                Node tree=q.poll();
                arr.add(tree.data);
                if(tree.left!=null){
                    q.add(tree.left);
                }
                if(tree.right!=null){
                    q.add(tree.right);
                }
            }
            if(count%2==0){
                ans.add(new ArrayList<>(arr));
            }else{
                ans.add(new ArrayList<>(reverse(arr)));
            }
            count++;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        call(ans,root);

        for(ArrayList<Integer> x:ans){
            System.out.println(x);
        }

    }
}
