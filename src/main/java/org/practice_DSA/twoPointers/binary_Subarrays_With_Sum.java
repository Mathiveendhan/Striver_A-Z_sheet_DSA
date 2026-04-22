package org.practice_DSA.twoPointers;

public class binary_Subarrays_With_Sum {
    public static int call(int[] arr,int goal){
        int l=0,r=0,res=0,count=0;

        while(r<arr.length){
            if(arr[r]==0){
                count++;
            }
            while(count>goal){
                if(arr[l]==0){
                    count--;
                }
                l++;
            }
            res=res+(r-l+1);
            r++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1};
        int goal=2;

        int result=call(arr,goal)-call(arr,goal-1);
        System.out.println(result);

    }
}
