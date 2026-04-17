package org.practice_DSA.pattern_problem;

public class pattern_15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int letter=65;
            for(int j=n-i;j>=0;j--){
                System.out.print((char)letter);
                letter++;
            }
            System.out.println();
        }
    }
}
