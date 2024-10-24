package datastructures.arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static int[] reverseAnArray(int[] array){
        int start = 0;
        int end = array.length - 1;
        int temp;

        while(start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        int[] anArray = reverseAnArray(array);
        System.out.println(Arrays.toString(anArray));

    }
}
