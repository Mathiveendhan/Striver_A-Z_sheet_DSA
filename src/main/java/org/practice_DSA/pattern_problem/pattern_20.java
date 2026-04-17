package org.practice_DSA.pattern_problem;

public class pattern_20 {
    public static void main(String[] args) {
        int n=16,space=(n*2)-2;
        for(int i=1;i<=n;i++){
            for(int a=0;a<i;a++){
                System.out.print("*");
            }
            for(int s1=space;s1>0;s1--){
                System.out.print(" ");
            }
            space-=2;
            for(int b=0;b<i;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        space+=4;
        for(int j=n-1;j>0;j--){
            for(int x=0;x<j;x++){
                System.out.print("*");
            }
            for(int s2=space;s2>0;s2--){
                System.out.print(" ");
            }
            space+=2;
            for(int y=0;y<j;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
