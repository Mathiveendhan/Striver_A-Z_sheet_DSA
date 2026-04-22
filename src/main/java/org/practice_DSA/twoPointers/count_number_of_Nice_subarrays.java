package org.practice_DSA.twoPointers;

public class count_number_of_Nice_subarrays {
    public static int call(int[] arr,int goal){
        int l=0,r=0,res=0,sum=0;

        while(r<arr.length){
            sum+=(arr[r]%2);
            while(sum>goal){
                    sum-=(arr[l]%2);
                l++;
            }
            res+=(r-l+1);
            r++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,1,1};
        int goal=3;

        int result=call(arr,goal)-call(arr,goal-1);
        System.out.println(result);

    }
}
