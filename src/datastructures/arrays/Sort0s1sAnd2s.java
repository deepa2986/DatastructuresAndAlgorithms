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
    public static void main(String[] args) {

        int[] array = {2,0,1,0,2,0,1,2,0};
        int[] zeroOneAndTwo = sortZeroOneAndTwo(array);
        System.out.println(Arrays.toString(zeroOneAndTwo));
    }
}
