package org.practice_DSA.pattern_problem;

public class pattern_22 {
    public static void call(int l,int r,int element,int[] arr){
        for(int i=l;i<=r;i++){
            arr[i]=element;
        }
    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=4,count=n+1;
        int size=n+(n-1);
        int[] arr=new int[size];
        int l=-1,r=size;
        for(int i=0;i<size;i++){
            if(i<n){
                l++;
                r--;
                count--;
                call(l,r,count,arr);
                print(arr);
            }else{
                l++;
                r--;
                count++;
                call(r,l,count,arr);
                print(arr);
            }
        }
    }
}
