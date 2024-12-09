package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array,int start, int end){
        if(start == end)
            return;
        int mid = (start + end) / 2;
        mergeSort(array,start,mid);
        mergeSort(array,mid + 1,end);
        merge(array,start,mid,end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] arrayLeft = new int[mid - start + 1];
        int[] arrayRight = new int[end - mid];
        for(int i = 0; i < arrayLeft.length; i++)
            arrayLeft[i] = array[start + i];
        for(int j = 0; j < arrayRight.length; j++)
            arrayRight[j] = array[mid + j + 1];

        int i = 0, j = 0;
        while (i < arrayLeft.length && j < arrayRight.length) {
            if (arrayLeft[i] < arrayRight[j])
                array[start++] = arrayLeft[i++];
            else array[start++] = arrayRight[j++];
        }
        while (i < arrayLeft.length)
            array[start++] = arrayLeft[i++];
        while (j < arrayRight.length)
            array[start++] = arrayRight[j++];
    }

    public static void main(String[] args) {
        int[] array = {9,6,8,2,7,1};
        mergeSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
