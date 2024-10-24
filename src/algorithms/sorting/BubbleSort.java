package algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void sort(int[] array){
        for(int k = 0 ; k < array.length - 1; k++){
            int flag = 0;//for optimization
            for (int i = 0; i < array.length - 1 - k; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;
        }
    }
    public static void main(String[] args) {
        int[] array = {4,9,3,1,10,8,2};
        sort(array);
        System.out.println(Arrays.toString(array));

        Random random = new Random();
        int[] numbers = new int[100];
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(10000);
        }

        sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
