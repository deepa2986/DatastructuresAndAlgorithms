package datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] getPairWithGivenSumBruteForce(int[] array,int sum){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j] == (sum - array[i])){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No pair found");
    }

    public static int[] getPairWithGivenSumOptimised(int[] array,int sum){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],i);
        }
        for(int i = 0; i < array.length; i++){
            int numToFind = sum - array[i];
            if(map.containsKey(numToFind) && map.get(numToFind) != i){
                return new int[]{i,map.get(numToFind)};
            }
        }
        throw new IllegalArgumentException("No pair found");
    }
    public static void main(String[] args) {

//        int[] array = {2,7,11,15};
//        int sum = 26;
        int[] array = {1,2,3,4,5,6,7};
        int sum = 9;
        int[] pairWithGivenSumBruteForce = getPairWithGivenSumBruteForce(array, sum);
        System.out.println(Arrays.toString(pairWithGivenSumBruteForce));
        int[] pairWithGivenSumOptimised = getPairWithGivenSumOptimised(array, sum);
        System.out.println(Arrays.toString(pairWithGivenSumOptimised));
    }
}
