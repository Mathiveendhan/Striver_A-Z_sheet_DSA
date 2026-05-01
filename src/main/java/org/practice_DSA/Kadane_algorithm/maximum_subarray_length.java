package org.practice_DSA.Kadane_algorithm;

public class maximum_subarray_length {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};

        int sum=0,max= Integer.MIN_VALUE;
        int start=0,arrStart=0,arrEnd=0;
        for(int i=0;i<arr.length;i++){

            if(sum==0) start=i;

            sum+=arr[i];
           // max=Math.max(max,sum);

            if(sum>max){
                max=sum;
                arrStart=start;
                arrEnd=i;
            }

            if(sum<0) sum=0;
        }
        System.out.println(arrEnd-arrStart+1);
    }
}
