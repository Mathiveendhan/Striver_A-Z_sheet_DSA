package org.practice_DSA.twoPointers;
import java.util.*;

public class longest_substring_no_repeation{
    public static void main(String[] args) {
        String s="cadbzabcd";
        int[] idx=new int[256];
        Arrays.fill(idx,-1);

        int l=0,r=0,max=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(idx[ch]!=-1){
                l=Math.max(l,idx[ch]+1);
            }
            idx[ch]=r;
            max=Math.max(max,r-l+1);
            r++;
        }
        System.out.print(max);
    }

}



//public class longest_substring_no_repeation {
//        public static void main(String[] args) {
//            String s="cadbzabcd";
//            Map<Character,Integer> map=new HashMap<>();
//            int l=0,r=0,max=0;
//            while(r<s.length()){
//                char ch=s.charAt(r);
//                if(!map.containsKey(ch)){
//                    map.put(ch,r);
//                }else{
//                    l=Math.max(l,map.get(ch)+1);
//                    map.put(ch,r);
//                }
//                max=Math.max(max,r-l+1);
//                r++;
//            }
//            System.out.print(max);
//        }
//}
