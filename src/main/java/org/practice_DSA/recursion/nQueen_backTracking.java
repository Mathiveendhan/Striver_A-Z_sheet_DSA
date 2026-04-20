package org.practice_DSA.recursion;

public class nQueen_backTracking {
        public static boolean isSafe(int r,int c,int[][] arr,int n){
            int row=r;
            while(row>=0 && row<n){
                if(arr[row][c]==1){
                    return false;
                }
                row++;
            }
            for(int col=0;col<n;col++){
                if(arr[r][col]==1){
                    return false;
                }
            }
            int col=c;
            row=r;
            while(row>=0 && col>=0 && row<n && col<n){
                if(arr[row][col]==1){
                    return false;
                }
                row--;
                col--;
            }

            col=c;
            row=r;

            while(row>=0 && col>=0 && row<n && col<n){
                if(arr[row][col]==1){
                    return false;
                }
                row++;
                col--;
            }
            return true;

        }
        public static void call(int c,int n,int[][] arr){
            if(c==n){
                for(int[] a:arr){
                    for(int b:a){
                        System.out.print(b);
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }

            for(int r=0;r<n;r++){
                if(isSafe(r,c,arr,n)){
                    arr[r][c]=1;
                    call(c+1,n,arr);
                    arr[r][c]=0;
                }
            }
        }
        public static void main(String[] args) {
            int n=4;
            int[][] arr=new int[n][n];
            call(0,n,arr);
        }
}
