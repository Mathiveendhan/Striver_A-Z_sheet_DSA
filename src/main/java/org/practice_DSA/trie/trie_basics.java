package org.practice_DSA.trie;

public class trie_basics {
     static class Node{
            Node[] links=new Node[26];
            boolean flag=false;

            boolean containsKey(char ch){
                return links[ch-'a']!=null;
            }

            Node get(char ch){
                return links[ch-'a'];
            }

            void put(char ch,Node node){
                links[ch-'a']=node;
            }

            void setEnd(){
                flag=true;
            }

            boolean isEnd(){
                return flag;
            }
        }

        static class Trie{
            private Node root;

            public Trie(){
                root=new Node();
            }

            //insert
            public void insert(String str){
                Node node=root;

                for(char c:str.toCharArray()){
                    if(!node.containsKey(c)){
                        node.put(c, node);
                    }
                    node=node.get(c);
                }
                node.setEnd();
            }

            //search (full word)
            public boolean search(String str){
                Node node=root;

                for(char c:str.toCharArray()){
                    if(!node.containsKey(c)){
                        return false;
                    }
                    node=node.get(c);
                }
                return node.isEnd();
            }

            //starts with (name)
            public boolean startsWith(String str){
                Node node=root;

                for(char c:str.toCharArray()){
                    if(!node.containsKey(c)){
                        return false;
                    }
                    node=node.get(c);
                }
                return true;
            }

        }
        public static void main(String[] args) {
            Trie trie=new Trie();

            trie.insert("apple");
            trie.insert("appl");

            System.out.println(trie.search("app"));
            System.out.println(trie.startsWith("ap"));

        }
}
