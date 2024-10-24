package datastructures.arrays;

public class MaxSumOfSubArrayOfSizeK {
    public static int getMaxSumOfSubArray(int[] array, int k){
        int maxSum = 0;
        for(int i = 0; i < array.length - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum = sum + array[j];
            }

            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }

    public static int getMaxSumOfSubArrayOptimised(int[] array, int k){
        int start = 0;
        int maxSum = 0;
        int sum = 0;
        for(int end = 0; end < array.length; end++){
            sum = sum + array[end];
            if(end >= k - 1){
                maxSum = Math.max(sum,maxSum);
                sum = sum - array[start];
                start++;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int[] array = {2,1,5,1,3,2};
        int k = 3;
        int maxSumOfSubArray = getMaxSumOfSubArray(array, k);
        System.out.println(maxSumOfSubArray);

        int maxSum = getMaxSumOfSubArrayOptimised(array, k);
        System.out.println(maxSum);


    }
}
