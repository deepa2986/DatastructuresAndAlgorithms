package datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTripletsWithZeroSum {

    public static List<List<Integer>> getTripletsWithZeroSum(int[] array){

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            int start = i + 1;
            int end = array.length - 1;
            if(i > 0 && array[i] == array[i - 1]){
                continue;
            }
            while (start < end){
                if(end < array.length -1 && array[end] == array[end - 1]){
                    end--;
                    continue;
                }
                if(array[i] + array[start] + array[end] == 0){
                    List<Integer> list = Arrays.asList(array[i], array[start], array[end]);
                    result.add(list);
                    start++;
                    end--;
                }else if(array[i] + array[start] + array[end] < 0){
                    start++;
                }else end--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> triplets = getTripletsWithZeroSum(array);
        System.out.println(triplets);

        int[] array1 = {-8,-7,5,2};
        List<List<Integer>> triplets1 = getTripletsWithZeroSum(array1);
        System.out.println(triplets1);

    }
}
