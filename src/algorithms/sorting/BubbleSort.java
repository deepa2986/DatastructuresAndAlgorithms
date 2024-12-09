package algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        for(int k = 0 ; k < array.length; k++){
            int flag = 0;
            for(int i = 0; i < array.length - k - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    flag = 1;
                }
            }
            if(flag == 0)break;
        }
    }

    private static void swap(int[] array,int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4,9,3,1,10,8,2};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        Random random = new Random();
        int[] numbers = new int[100];
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000);
        }

        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
