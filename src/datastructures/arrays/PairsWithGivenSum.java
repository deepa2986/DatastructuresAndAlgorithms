package datastructures.arrays;

public class PairsWithGivenSum {

    public static void getPairsWithGivenSum(int[] array, int sum){
        int low = 0;
        int high = array.length - 1;
        while(low < high){
            if(array[low] + array[high] > sum)
                high--;
            if(array[low] +array[high] < sum)
                low++;
            if(array[low] + array[high] == sum)
                System.out.println("(" + array[low] + "," + array[high] + ")");
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int sum = 9;
        getPairsWithGivenSum(array,sum);
    }
}
