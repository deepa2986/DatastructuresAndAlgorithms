package datastructures.arrays;

public class FindTheLengthOfLongestSubArray {

    public static int getTheLengthOfLongestSubArray(int[] array){
        if(array.length == 0)
            return 0;
        int length = 1;
        int maxLength = 1;
        for(int i = 1; i < array.length; i++){
            if(array[i] > array[i-1]){
                length++;
            }else length = 1;
            maxLength = Math.max(length,maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = {1,2,6,0,7};
        int lengthOfLongestSubArray = getTheLengthOfLongestSubArray(array);
        System.out.println(lengthOfLongestSubArray);
    }
}
