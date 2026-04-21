package org.practice_DSA.tree;
import java.util.*;

public class BFS {
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
        public static void bfs(Node node){
            Queue<Node> q=new LinkedList<>();
            q.add(node);

            while(!q.isEmpty()){
                ArrayList<Integer> ans=new ArrayList<>();
                int n=q.size();
                for(int i=0;i<n;i++){
                    Node tree=q.poll();
                    ans.add(tree.data);
                    if(tree.left!=null){
                        q.add(tree.left);
                    }
                    if(tree.right!=null){
                        q.add(tree.right);
                    }
                }
                System.out.println(ans);
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

            root.left.left.left = new Node(8);
            root.left.left.right = new Node(9);
            root.left.right.left = new Node(10);
            root.left.right.right = new Node(11);
            root.right.left.left = new Node(12);
            root.right.left.right = new Node(13);
            root.right.right.left = new Node(14);
            root.right.right.right = new Node(15);
            bfs(root);
        }


}
