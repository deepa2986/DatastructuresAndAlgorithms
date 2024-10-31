package datastructures.arrays;

import java.util.Arrays;

public class FindTheSecondLargestElement {

    public static void printTheSecondLargestEle(int[] array){
        int n = array.length;
        if (n < 2) {
            System.out.println("Second largest does not exist");
            return;
        }
        Arrays.sort(array);
        int secondLargest = array[n-2];
        System.out.println(secondLargest);
    }

    public static int getSecondLargestEleOptimised(int[] array){
        if (array.length < 2){
            System.out.println("second largest does not exist");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                secondLargest= largest;
                largest = array[i];
            }
            if(array[i] != largest && array[i] > secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] array = {-1,70,10,34,18,78};
        printTheSecondLargestEle(array);

        int secondLargestEleOptimised = getSecondLargestEleOptimised(array);
        System.out.println(secondLargestEleOptimised);
    }
}
