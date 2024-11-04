package datastructures.arrays;

import java.util.Arrays;

public class FindDuplicateWithOutUsingExtraSpace {
    public static int findDuplicate(int[] array){
        for(int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return array[i];
                }
            }
        }
        return -1;
    }

    public static int findDuplicateUsingSorting(int[] array){
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] == array[i+1]){
                return array[i];
            }
        }
        return -1;
    }

    public static int findDuplicateOptimised(int[] array){
        for(int i = 0; i < array.length; i++){
            int index = Math.abs(array[i]);
            if(array[index] < 0){
                return index;
            }else array[index] = -array[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,3,2,2};
        int duplicate = findDuplicate(array);
        System.out.println(duplicate);

        int duplicateUsingSorting = findDuplicateUsingSorting(array);
        System.out.println(duplicateUsingSorting);

        int duplicateOptimised = findDuplicateOptimised(array);
        System.out.println(duplicateOptimised);
    }
}
