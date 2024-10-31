package datastructures.arrays;

import java.util.Arrays;

public class ReverseAnArrayInGroups {

    public static void reverse(int[] array,int k){
        for(int i = 0; i < array.length; i = i + k){
            int start = i;
            int end = Math.min(i+k-1, array.length - 1);
            while(start < end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,5,7,2,3,6,7,8,9};
        System.out.println(Arrays.toString(array));
        int k = 5;
        reverse(array,k);
        System.out.println(Arrays.toString(array));

    }
}
