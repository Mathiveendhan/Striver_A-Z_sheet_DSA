package org.practice_DSA.pattern_problem;

public class pattern_9 {
    public static void main(String[] args) {
        // first pyramid pattern code
        int n1=7,count1=1;
        for(int i=0;i<n1;i++){
            for(int space=n1-i;space>0;space--){
                System.out.print(" ");
            }
            for(int j=0;j<count1;j++){
                System.out.print("*");
            }
            count1+=2;
            System.out.println();
        }

        // second pyramid pattern code

        int n2=7,count2=n2+(n2-1);
        for(int i=0;i<n2;i++){
            for(int s=i;s>=0;s--){
                System.out.print(" ");
            }
            for(int j=0;j<count2;j++){
                System.out.print("*");
            }
            count2-=2;
            System.out.println();
        }
    }
}
