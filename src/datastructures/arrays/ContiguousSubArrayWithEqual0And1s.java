package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubArrayWithEqual0And1s {

    public static int findMaxSubArrayLengthBruteForce(int[] array){
        int maxLength = 0;
      for(int i = 0; i < array.length; i++){
          int zeroCount = 0,oneCount = 0;
          for(int j = i; j < array.length; j++){
              if(array[j] == 0){
                  zeroCount++;
              }else{
                  oneCount++;
              }
              if(zeroCount == oneCount){
                  maxLength = Math.max(maxLength,j-i+1);
              }
          }
      }
      return maxLength;
    }

    public static int findMaxSubArrayLengthOptimised(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                sum += -1;
            }
            if(array[i] == 1){
                sum += 1;
            }
            if(map.containsKey(sum)){
                maxLength = Math.max(maxLength,i - map.get(sum));
            }else map.put(sum,i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = {1,0,1,1,1,0,0};
        int maxLength = findMaxSubArrayLengthBruteForce(array);
        System.out.println(maxLength);

        int maxSubArrayLength = findMaxSubArrayLengthOptimised(array);
        System.out.println(maxSubArrayLength);
    }
}
