package org.practice_DSA.twoPointers;
import java.util.*;

public class longest_SubstringWith_At_Most_K_DistinctCharacters {
        public static void main(String[] args) {
            //int[] arr={3,3,3,1,2,1,1,2,3,3,4};
            String s="aaaaabbccd";
            int k=2;

            HashMap<Character,Integer> map=new HashMap<>();

            int l=0,r=0,max=0;

            while(r<s.length()){
                char ch=s.charAt(r);
                map.put(ch,map.getOrDefault(ch,0)+1);
                while(map.size()>2){
                    map.put(s.charAt(l),map.get(s.charAt(l))-1);
                    if(map.get(s.charAt(l))==0){
                        map.remove(s.charAt(l));
                    }
                    l++;
                }
                max=Math.max(max,r-l+1);
                r++;
            }
            System.out.println(max);
        }
//    public static void main(String[] args) {
//        //int[] arr={3,3,3,1,2,1,1,2,3,3,4};
//        String s="aaaaabbccd";
//        int k=2;
//
//        HashMap<Character,Integer> map=new HashMap<>();
//
//        int l=0,r=0,max=0;
//
//        while(r<s.length()){
//            char ch=s.charAt(r);
//            map.put(ch,map.getOrDefault(ch,0)+1);
//            if(map.size()>2){
//                map.put(s.charAt(l),map.get(s.charAt(l))-1);
//                if(map.get(s.charAt(l))==0){
//                    map.remove(s.charAt(l));
//                }
//                l++;
//            }
//            max=Math.max(max,r-l+1);
//            r++;
//        }
//        System.out.println(max);
//    }
}
