package org.practice_DSA.twoPointers;

public class Number_of_Substrings_Containing_All_Three_Characters {
    public static void main(String[] args) {
        String s="bbacba";
        int[] lastSeen={-1,-1,-1};

        int sum=0,idx=0;

        while(idx<s.length()){
            char ch=s.charAt(idx);
            lastSeen[ch-'a']=idx;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                int min=Math.min(lastSeen[0],lastSeen[1]);
                min=Math.min(min,lastSeen[2]);
                sum+=(1+min);
            }
            idx++;
        }
        System.out.println(sum);
    }
}
