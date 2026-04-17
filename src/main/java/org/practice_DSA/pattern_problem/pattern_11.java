package org.practice_DSA.pattern_problem;

public class pattern_11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int print=(i%2);
            for(int j=0;j<i;j++){
                if(print==0){
                    System.out.print(print);
                    print=1;
                }else{
                    System.out.print(print);
                    print=0;
                }
            }
            System.out.println();
        }
    }
}
