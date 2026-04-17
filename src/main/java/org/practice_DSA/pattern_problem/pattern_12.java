package org.practice_DSA.pattern_problem;

public class pattern_12 {
    public static void main(String[] args) {
        // formula to find to calculate the space for this program
        int n=9,space=((n-1)*2)-1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int s=space;s>0;s--){
                System.out.print(" ");
            }

            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            space-=2;
            System.out.println();
        }
    }
}
