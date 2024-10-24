package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindAnElementAppearsOnce {
    public static int getAnElementAppearsOnce(int[] array){
        Map<Integer,Integer> map  =new HashMap<>();
        int result = 0;
        for(int i = 0; i < array.length; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,4,5,6,6};
        int anElementAppearsOnce = getAnElementAppearsOnce(array);
        System.out.println(anElementAppearsOnce);
    }
}

