package org.practice_DSA.twoPointers;

import java.util.*;

public class fruitBasket {
        public static void main(String[] args) {
            int[] arr={3,3,3,1,2,1,1,2,3,3,4};
            int k=2;

            HashMap<Integer,Integer> map=new HashMap<>();

            int l=0,r=0,max=0;

            while(r<arr.length){
                map.put(arr[r],map.getOrDefault(arr[r],0)+1);
                while(map.size()>2){
                    map.put(arr[l],map.get(arr[l])-1);
                    if(map.get(arr[l])==0){
                        map.remove(arr[l]);
                    }
                    l++;
                }
                max=Math.max(max,r-l+1);
                r++;
            }
            System.out.println(max);
        }
//        public static void main(String[] args) {
//            int[] arr={3,3,3,1,2,1,1,2,3,3,4};
//            int k=2;
//
//            HashMap<Integer,Integer> map=new HashMap<>();
//
//            int l=0,r=0,max=0;
//
//            while(r<arr.length){
//                map.put(arr[r],map.getOrDefault(arr[r],0)+1);
//                if(map.size()>2){
//                    map.put(arr[l],map.get(arr[l])-1);
//                    if(map.get(arr[l])==0){
//                        map.remove(arr[l]);
//                    }
//                    l++;
//                }
//                if(map.size()<=k){
//                    max=Math.max(max,r-l+1);
//                }
//                r++;
//            }
//            System.out.println(max);
//        }
}
