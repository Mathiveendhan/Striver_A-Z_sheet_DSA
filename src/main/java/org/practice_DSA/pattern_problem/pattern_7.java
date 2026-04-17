package org.practice_DSA.pattern_problem;

public class pattern_7 {
    public static void main(String[] args) {
        int n=7,count=1;
        for(int i=1;i<=n;i++){
            for(int space=n-i;space>0;space--){
                System.out.print(" ");
            }
            for(int j=0;j<count;j++){
                System.out.print("*");
            }
            count+=2;
            System.out.println();
        }
    }
}
