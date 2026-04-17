package org.practice_DSA.pattern_problem;

public class pattern_19 {
    public static void main(String[] args) {
        int n=15,space=0;
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            for(int s=space;s>0;s--){
                System.out.print(" ");
            }
            space+=2;
            for(int k=n-i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
        space-=2;

        for(int a=1;a<=n;a++){
            for(int b=0;b<a;b++){
                System.out.print("*");
            }
            for(int sp=space;sp>0;sp--){
                System.out.print(" ");
            }
            space-=2;
            for(int c=0;c<a;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
