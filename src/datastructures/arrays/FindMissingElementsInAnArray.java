package datastructures.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElementsInAnArray {
    public static List<Integer> findTheMissingElements(int[] array){
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i : array){
            set.add(i);
        }
        for(int i = 1; i < array.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
    
    public  static List<Integer> findTheMissingElementsOptimised(int[] array){
        List<Integer> result = new ArrayList<>();
        for(int i : array){
            int index = Math.abs(i) - 1;
            if (array[index] > 0) {
                array[index] = -array[index];
            }
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {2,3,3,4,5};
        List<Integer> theMissingElements = findTheMissingElements(array);
        System.out.println(theMissingElements);

        List<Integer> missingNumbers = findTheMissingElementsOptimised(array);
        System.out.println(missingNumbers);
    }
}
