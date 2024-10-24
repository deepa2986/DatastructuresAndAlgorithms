package datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

    public static void printDuplicates(int[] array){
        Set<Integer> uniqueNumber = new HashSet<>();
        boolean isDuplicate = false;
        for(int i = 0; i < array.length; i++){
            if(uniqueNumber.contains(array[i])){
                isDuplicate = true;
                System.out.print(array[i] +" ");
            }else{
                uniqueNumber.add(array[i]);
            }
        }
        if(!isDuplicate)
            System.out.println(-1);
    }
    public static void main(String[] args) {
        int[] array = {1,5,2,4,1,7,3,5,9,8,2,4};
        printDuplicates(array);

        System.out.println();
        int[] array2 = {9,5,1,4,8,3};
        printDuplicates(array2);
    }
}
