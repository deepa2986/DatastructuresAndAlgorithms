package datastructures.arrays;

public class MaximumSubArraySum {

    public static int getMaxSubArraySum(int[] array){
        int sum = 0;
        int maxSum = array[0];
        for(int i = 0; i < array.length; i++){

            if(sum < 0){
                sum = array[i];
            }else{
                sum = sum + array[i];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] array = {1,2,-5,4,3,8,5};
        int maxSubArraySum = getMaxSubArraySum(array);
        System.out.println(maxSubArraySum);
    }
}
