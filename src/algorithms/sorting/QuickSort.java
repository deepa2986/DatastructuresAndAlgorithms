package algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int start, int end){
        if(start < end){
            int partitionIndex = partition(array,start,end);
            quickSort(array, start,partitionIndex - 1);
            quickSort(array,partitionIndex + 1, end);
        }
    }
    private static int partition(int[] array, int start, int end) {
        int pivot = end;
        int partitionIndex = start;
        for(int i = start; i < end; i++){
            if(array[i] < pivot){
                swap(array , i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array,partitionIndex ,end);
        return partitionIndex;
    }

    private static void swap(int[] array,int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2,1,3,9,7,4,8};
        quickSort(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
