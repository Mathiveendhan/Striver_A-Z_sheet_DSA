package org.practice_DSA.pattern_problem;

public class pattern_10 {
    public static void main(String[] args) {
        int n=5 ;
        // we can do this problem use the same approach which we used in pattern_9,but we use a different approach
        for(int i=0;i<(n*2);i++){
            int count=i;
            if(count>n) count=(n*2)-count;
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
