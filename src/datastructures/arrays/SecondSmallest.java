package datastructures.arrays;

import java.util.Arrays;

public class SecondSmallest {

    public static void getSecondSmallest(int[] array){
        Arrays.sort(array);
        System.out.println(array[1]);
    }
    public static int getSecondSmallestOptimised(int[] array){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
            if(array[i] > smallest && array[i] < secondSmallest){
                secondSmallest = array[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {

        int[] array = {-1,10,2,5,8,9,7,-1,1};
        int secondSmallest = getSecondSmallestOptimised(array);
        System.out.println(secondSmallest);
        getSecondSmallest(array);
    }
}
