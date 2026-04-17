package org.practice_DSA.pattern_problem;

public class pattern_17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int letter=65;
            for(int s=n-i;s>0;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)letter);
                letter++;
            }
            letter-=2;
            for(int k=i-1;k>0;k--){
                System.out.print((char)letter);
                letter--;
            }
            System.out.println();
        }
    }
}
