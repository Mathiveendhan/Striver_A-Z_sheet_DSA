package org.practice_DSA.dynamic_programming.DP_1D;

public class Maximum_Sum_of_Non_Adjacent_Element {
        public static void call(int[] num,int i,int[] max,int sum){
            if(i>=num.length){
                max[0]=Math.max(max[0],sum);
                return;
            }
            call(num,i+2,max,sum+num[i]);
            call(num,i+1,max,sum);
        }
        public static void main(String[] args) {
            int[] num={2,1,4,9,3,8};
            int[] max={0};
            call(num,0,max,0);
            System.out.println(max[0]);
        }
}
