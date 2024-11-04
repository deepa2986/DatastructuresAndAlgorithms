package datastructures.arrays;

import java.util.Arrays;

public class SubArraySumEqualToGivenSum {

    public static int[] findTheLengthOfSubArraySum(int[] array,int k){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = array[i];
            for(int j = i + 1; j <= array.length; j++){
                if(sum == k){
                    return new int[]{i,j-1};
                }
                if(sum > k)
                    break;
                if(j < array.length)
                    sum = sum + array[j];
            }
        }
        return new int[]{-1};
    }

    public static int[] findTheLengthOfSubArraySumOptimised(int[] array,int k){
        int start = 0;
        int end = 1;
        int sum = array[0];
        while (end <= array.length){
            while (sum > k  && start < end - 1){
                sum = sum - array[start];
                start++;
            }
            if(sum == k){
                return new int[]{start,end - 1};
            }
            if(end < array.length){
                sum = sum + array[end];
            }
            end++;
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        int[] array = {1,4,20,3,10,5};
        int k = 33;
        int[] lengthOfSubArraySum = findTheLengthOfSubArraySum(array, k);
        System.out.println(Arrays.toString(lengthOfSubArraySum));

        int[] theLengthOfSubArraySum = findTheLengthOfSubArraySumOptimised(array, k);
        System.out.println(Arrays.toString(theLengthOfSubArraySum));
    }
}
