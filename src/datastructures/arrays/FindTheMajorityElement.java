package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindTheMajorityElement {

    public static int getTheMajorityElement(int[] array){
        Map<Integer,Integer> countmap = new HashMap<>();
        Integer result = null;
        for(int i = 0; i < array.length; i++){
            countmap.put(array[i],countmap.getOrDefault(array[i],0)+1);
        }
        int value = array.length/2;
        for(Map.Entry<Integer,Integer> entry : countmap.entrySet()){
            if(entry.getValue()> value){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,1,3,1,1,2,2,1,1,3};
        int majorityElement = getTheMajorityElement(array);
        System.out.println(majorityElement);
    }
}
