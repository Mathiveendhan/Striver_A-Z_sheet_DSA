package org.practice_DSA.pattern_problem;

public class pattern_8 {
    public static void main(String[] args) {
        int n=7,count=n+(n-1);
        for(int i=0;i<n;i++){
            for(int s=i;s>0;s--){
                System.out.print(" ");
            }
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            count-=2;
            System.out.println();
        }
    }
}
