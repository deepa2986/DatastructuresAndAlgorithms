package datastructures.arrays;

public class MaxConsecutiveOnesWithKFlip {

    public static int maxConsecutiveOnesWithKFlip(int[] array,int k){
        int start = 0;
        int maxConsecutiveOne = 0;
        int zeroCount = 0;
        for(int end = 0; end < array.length; end++){
            if(array[end] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(array[start] == 0){
                    zeroCount--;
                }
                start++;
            }
            maxConsecutiveOne = Math.max(maxConsecutiveOne, end-start+1);
        }
        return maxConsecutiveOne;
    }
    public static void main(String[] args) {
        int[] array = {1,1,0,0,0,1,1,1,1,1,1};
        int k = 2;
        int maxConsecutiveOnes = maxConsecutiveOnesWithKFlip(array, k);
        System.out.println(maxConsecutiveOnes);
    }
}
