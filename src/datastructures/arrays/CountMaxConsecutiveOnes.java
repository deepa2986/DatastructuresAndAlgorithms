package datastructures.arrays;

public class CountMaxConsecutiveOnes{

    public static int getMaxConsecutiveOnes(int[] array){
        int count = 0;
        int maxConsecutiveOne = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == 1){
                count++;
                maxConsecutiveOne = Math.max(count,maxConsecutiveOne);
            }else {
                count = 0;
            }
        }
        return maxConsecutiveOne;
    }
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1,1,1,1,0,0,1,1,1};
        int maxConsecutiveOnes = getMaxConsecutiveOnes(array);
        System.out.println(maxConsecutiveOnes);
    }
}
