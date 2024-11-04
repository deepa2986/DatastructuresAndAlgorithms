package datastructures.arrays;

import java.util.Arrays;

public class AddOneToArray {

    public static int[] plusOne(int[] array){
        int i = array.length - 1;
        while (i >= 0){
            if(array[i] != 9){
                array[i] = array[i] + 1;
                return array;
            }
            array[i] = 0;
            i--;
        }
        int[] result = new int[array.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] plusOne = plusOne(array);
        System.out.println(Arrays.toString(plusOne));
    }
}
