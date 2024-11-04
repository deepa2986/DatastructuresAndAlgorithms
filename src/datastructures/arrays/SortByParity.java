package datastructures.arrays;

import java.util.Arrays;

public class SortByParity {

    public static int[] segregateEvenAndOddNumbers(int[] array){
        int[] result = new int[array.length];
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
               result[count++] = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                result[count++] = array[i];
            }
        }
        return result;
    }

    public static int[] sortArrayByParityOptimised(int[] array){
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                int temp = array[j];
                array[j++] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10,13,44,19,9,12};
        int[] evenAndOddNumbers = segregateEvenAndOddNumbers(array);
        System.out.println(Arrays.toString(evenAndOddNumbers));

        int[] sortArrayByParity = sortArrayByParityOptimised(array);
        System.out.println(Arrays.toString(sortArrayByParity));
    }
}
