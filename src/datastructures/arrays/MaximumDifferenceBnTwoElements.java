package datastructures.arrays;

public class MaximumDifferenceBnTwoElements {

    public static int maxDifferenceBruteForce(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] < array[j]){
                    max = Math.max(max,array[j] - array[i]);
                }
            }
        }
        return max;
    }
    public static int maxDifferenceOptimised(int[] array){
        int min = array[0];
        int max = array[1] - array[0];
        for(int i = 0; i < array.length; i++){
            if((array[i] - min) > max){
                max = array[i] - min;
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] array = {17,19,15,16,11,21,27};
        int max = maxDifferenceBruteForce(array);
        System.out.println(max);

        int maxDifferenceOptimised = maxDifferenceOptimised(array);
        System.out.println(maxDifferenceOptimised);
    }
}
