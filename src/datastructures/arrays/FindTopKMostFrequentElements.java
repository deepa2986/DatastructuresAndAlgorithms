package datastructures.arrays;
import java.util.*;

public class FindTopKMostFrequentElements {

    public static List<Integer> getTopKMostElements(int[] array, int k){
        Map<Integer,Integer> countMap = new HashMap<>();
        int maxFrequency = 0;
        for(int i = 0; i < array.length; i++){
            int frequency = countMap.getOrDefault(array[i],0)+1;
            countMap.put(array[i],frequency);
            maxFrequency = Math.max(maxFrequency,frequency);
        }
        List<Integer> [] bucket = new List[maxFrequency+1];
        for(int i : countMap.keySet()){
            int frequency = countMap.get(i);
            if(bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(i);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = bucket.length - 1; i >= 0 && k > 0; i--){
            if(bucket[i] != null){
                List<Integer> list = bucket[i];
                result.addAll(list);
                k -= list.size();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,3,3,3};
        int k = 2;
        List<Integer> topKMostElements = getTopKMostElements(array, k);
        System.out.println(topKMostElements);

    }
}
