package datastructures.arrays;

public class BuyAndSellStock {

    public static int getMaxProfit(int[] array){
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
            if((array[i] - min) > max){
                max = array[i] - min;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        int maxProfit = getMaxProfit(array);
        System.out.println(maxProfit);
    }
}
