package datastructures.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] findProductUsingDivision(int[] array){
        int[] result = new int[array.length];
        int product = 1;
        for(int i = 0; i < array.length; i++){
            product = product * array[i];
        }
        for (int i = 0; i < array.length; i++){
            result[i] = product/array[i];
        }
        return result;
    }

    public static int[] findProductOptimised(int[] array){

        int length = array.length;
        int[] result = new int[length];
        result[0] = 1;
        for(int i = 1; i < length; i++){
            result[i] = result[i-1] * array[i-1];
        }
        int right = 1;
        for(int i = length - 1; i >= 0; i--){
            result[i] = result[i] * right;
            right = right * array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {4,2,1,7};
        System.out.println(Arrays.toString(array));
        int[] productUsingDivision = findProductUsingDivision(array);
        System.out.println(Arrays.toString(productUsingDivision));

        int[] productOfArray = findProductOptimised(array);
        System.out.println(Arrays.toString(productOfArray));
    }

}
