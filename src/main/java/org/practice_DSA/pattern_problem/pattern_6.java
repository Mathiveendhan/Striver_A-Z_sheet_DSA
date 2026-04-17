package org.practice_DSA.pattern_problem;

public class pattern_6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
