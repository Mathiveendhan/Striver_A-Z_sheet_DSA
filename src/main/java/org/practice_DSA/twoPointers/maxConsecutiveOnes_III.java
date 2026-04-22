package org.practice_DSA.twoPointers;

public class maxConsecutiveOnes_III {
     public static void main(String[] args) {
            int[] arr={1,1,1,0,0,0,1,1,1,1,0};
            int k=2,zero=0;

            int l=0,r=0,max=0;
            while(r<arr.length){
                if(arr[r]==0){
                    zero++;
                }
                if(zero>k){
                    if(arr[l]==0){
                        zero--;
                    }
                    l++;
                }

                max=Math.max(max,r-l+1);
                r++;

            }
            System.out.println(max);
        }
//        public static void main(String[] args) {
//            int[] arr={1,1,1,0,0,0,1,1,1,1,0};
//            int k=2,zero=0;
//
//            int l=0,r=0,max=0;
//            while(r<arr.length){
//                if(arr[r]==0){
//                    zero++;
//                }
//                while(zero>k){
//                    if(arr[l]==0){
//                        zero--;
//                    }
//                    l++;
//                }
//
//                max=Math.max(max,r-l+1);
//                r++;
//
//            }
//            System.out.println(max);
//        }
}
