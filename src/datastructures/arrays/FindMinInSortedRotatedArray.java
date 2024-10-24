package datastructures.arrays;

public class FindMinInSortedRotatedArray {

    public static int minByTraversing(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int minElementOptimised(int[] array){
        if(array.length == 1){
            return array[0];
        }
        int start = 0;
        int end = array.length - 1;
        if(array[0] < array[end]){
            return array[0];
        }

        while (start <= end){

            int mid = (start + end)/2;
            if(start < mid && array[mid] < array[mid - 1]){
                return array[mid];
            }else if (end > mid && array[mid + 1] < array[mid]){
                return array[mid + 1];
            }else if(array[end] > array[mid]){
                end = mid - 1;
            }else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {8,9,10,2,3,4};
        int min = minByTraversing(array);
        System.out.println(min);

        int minElementOptimised = minElementOptimised(array);
        System.out.println(minElementOptimised);

    }
}
