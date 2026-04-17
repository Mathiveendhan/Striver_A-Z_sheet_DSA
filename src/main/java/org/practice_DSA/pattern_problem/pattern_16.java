package org.practice_DSA.pattern_problem;

public class pattern_16 {
    public static void main(String[] args) {
        int n=5,letter=65;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)letter);
            }
            letter++;
            System.out.println();
        }
    }
}
