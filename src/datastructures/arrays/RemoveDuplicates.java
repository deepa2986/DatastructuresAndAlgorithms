package datastructures.arrays;

import java.util.*;

public class RemoveDuplicates {

    public static void removeDuplicatesByBruteForce(int[] array){
        int j = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] != array[i+1]){
                array[j++] = array[i];
            }
        }
        array[j++] = array[array.length - 1];
        for(int i = 0; i < j; i++)
            System.out.print(array[i] + " ");
    }
    public static void removeDuplicatesByHashMap(int[] array){
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],map.getOrDefault(array[i],0) +1);
        }
        map.forEach((k,v) -> System.out.print(k + " "));
    }

    public static void removeDuplicatesBySet(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length ;i++){
            set.add(array[i]);
        }
        set.forEach(s -> System.out.print(s + " ") );
    }
    public static void main(String[] args) {
        int[] array = {3,1,4,1,2,6,5,6,4,4,9,7};
        removeDuplicatesByBruteForce(array);
        System.out.println();
        removeDuplicatesByHashMap(array);
        System.out.println();
        removeDuplicatesBySet(array);
    }
}
