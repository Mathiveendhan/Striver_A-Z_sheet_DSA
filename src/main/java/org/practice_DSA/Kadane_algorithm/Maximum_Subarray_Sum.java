package org.practice_DSA.Kadane_algorithm;

public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};

        int sum=0,max= Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        System.out.println(max);
    }
}
