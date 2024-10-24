package datastructures.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];
        int i = 0, j = 0, k = 0;
        while (i < length1 && j < length2){
            if(array1[i] < array2[j]){
                result[k++] = array1[i++];
            }else{
                result[k++] = array2[j++];
            }
        }
        while(i < length1){
            result[k++] = array1[i++];
        }
        while(j < length2){
            result[k++] = array2[j++];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {1,5,7};
        int[] array2 = {2,6,8,9};
        int[] mergeTwoSortedArrays = mergeTwoSortedArrays(array1, array2);
        System.out.println(Arrays.toString(mergeTwoSortedArrays));
    }
}
