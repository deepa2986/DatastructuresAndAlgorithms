package datastructures.arrays;

import java.util.Arrays;

public class Sort0s1sAnd2s {

    public static int[] sortZeroOneAndTwo(int[] array){
        int zeroCount = 0;
        int oneCount = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 0)
                zeroCount++;

            if(array[i] == 1)
                oneCount++;
        }
        for(int i = 0; i < zeroCount; i++){
            array[i] = 0;
        }
        for(int i = zeroCount ; i < (zeroCount + oneCount); i++){
            array[i] = 1;
        }
        for(int i = (zeroCount + oneCount); i < array.length; i++){
            array[i] = 2;
        }
        return array;
    }

    public static int[] sortOptimised(int[] array){
        int start = 0;
        int mid = 0;
        int end = array.length - 1;
        while(mid <= end){
            switch (array[mid]){
                case 0:{
                    swap(array,start,mid);
                    start++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2 : {
                    swap(array,mid,end);
                    end--;
                    break;
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    public static void main(String[] args) {

        int[] array = {2,0,1,0,2,0,1,2,0};
        int[] zeroOneAndTwo = sortZeroOneAndTwo(array);
        System.out.println(Arrays.toString(zeroOneAndTwo));

        int[] sorted = sortOptimised(array);
        System.out.println(Arrays.toString(sorted));
    }
}
