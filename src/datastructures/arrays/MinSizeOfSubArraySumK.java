package datastructures.arrays;

public class MinSizeOfSubArraySumK {

    public static int findTheMinLengthOfSubArray(int[] array,int k){
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for(int j = i; j < array.length; j++){
                sum = sum + array[j];
                if(sum >= k){
                    minLength = Math.min(minLength,(j-i) +1);
                    break;
                }
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static int findTheMinLengthOfSubArrayOptimised(int[] array,int k){
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        for(int end = 0; end < array.length; end++){
            sum = sum + array[end];
            while (sum >= k && start <= end){
                minLength = Math.min(minLength, (end-start)+1);
                sum = sum - array[start++];
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
    public static void main(String[] args) {
        int[] array = {7,2,1,1,6,5};
        int k = 11;
        int lengthOfSubArray = findTheMinLengthOfSubArray(array, k);
        System.out.println(lengthOfSubArray);

        int minLengthOfSubArray = findTheMinLengthOfSubArrayOptimised(array, k);
        System.out.println(minLengthOfSubArray);

    }
}
