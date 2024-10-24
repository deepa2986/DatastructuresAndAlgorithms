package datastructures.arrays;

import java.util.*;

public class FindAllDuplicates {

    public static void getAllDuplicatesUsingBruteForce(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){
                    System.out.print(array[i] + " ");
                }
            }
        }
    }

    public static void getAllDuplicatesUsingMap(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        map.forEach((k,v) -> {
            if(v > 1){
                System.out.print(k + " ");
            }
        });
    }

    public static void getAllDuplicatesByUsingSet(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            if(set.contains(array[i])){
                System.out.print(array[i] + " ");
            }else set.add(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {8,1,4,3,1,6,8,5,6,9};
        getAllDuplicatesUsingBruteForce(array);
        System.out.println();
        getAllDuplicatesUsingMap(array);
        System.out.println();
        getAllDuplicatesByUsingSet(array);
    }
}
