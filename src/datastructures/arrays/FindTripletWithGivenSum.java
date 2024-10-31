package datastructures.arrays;

import java.util.Arrays;

public class FindTripletWithGivenSum {
    public static boolean getTripletWithBruteForce(int[] array,int sum){

        if(array.length < 3)
            return false;

        for(int i = 0; i < array.length - 2; i++){
            for(int j = i + 1; j < array.length -1; j++){
                for(int k = j + 1; k < array.length; k++){
                    if(array[i] + array[j] + array[k] == sum){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean getTripletOptimised(int[] array, int sum){
        if(array.length < 3)
            return false;

        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            int start = i + 1;
            int end = array.length - 1;

            while (start < end){
                if(array[i] + array[start] + array[end] == sum){
                    return true;
                }else if(array[i] + array[start] + array[end] < sum){
                    start++;
                }else end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1,4,45,6,10,8};
        int sum = 13;
        boolean triplet = getTripletWithBruteForce(array, sum);
        System.out.println(triplet);

        boolean tripletOptimised = getTripletOptimised(array, sum);
        System.out.println(tripletOptimised);

    }
}
