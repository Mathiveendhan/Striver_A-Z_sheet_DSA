package org.practice_DSA.twoPointers;

public class maximum_points_obtain_from_cards {
        public static void main(String[] args) {
            int[] arr={6,2,3,4,7,2,1,7,1};
            int k=4;

            int l=arr.length-1,r=k-1,sum=0;


            for(int i=0;i<k;i++){
                sum+=arr[i];
            }

            int max=sum;

            while(r>=0){
                sum-=arr[r];
                sum+=arr[l];
                max=Math.max(max,sum);
                r--;
                l--;
            }
            System.out.println(max);

        }
}
