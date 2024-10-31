package datastructures.arrays;

import java.util.Arrays;

public class RotateAnArrayByKSteps {

    public static void rotateAnArrayByK(int[] array,int k){
        int i = 0;
        while (k > 0){
            int temp = array[array.length - 1];
            for(i = array.length - 1; i > 0; i--){
                array[i] = array[i - 1];
            }
            array[i] = temp;
            k--;
        }
    }

    public static void rotateByKOptimised(int[] array,int k){
        int length = array.length;
        k = k % length;
        reverse(0,length - k -1, array);
        reverse(length - k, length -1, array);
        reverse(0,length - 1, array);

    }

    public static void reverse(int start, int end, int[] array){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,8,9,10};
        System.out.println(Arrays.toString(array));
        int k = 3;
        rotateAnArrayByK(array,k);
        System.out.println(Arrays.toString(array));

        int[] array1 = {1,2,3};
        int k1 = 5;
        rotateByKOptimised(array1,k1);
        System.out.println(Arrays.toString(array1));


    }
}
