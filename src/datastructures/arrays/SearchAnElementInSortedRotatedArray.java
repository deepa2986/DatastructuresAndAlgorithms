package datastructures.arrays;

public class SearchAnElementInSortedRotatedArray {

    public static int searchUsingLinear(int[] array, int target){
        if(array.length == 0){
            return -1;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int searchUsingBinary(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(array[mid] == target)
                return mid;
            if(array[start] <= array[mid]){
                if(target >= array[start] && target <= array[mid]){
                    end = mid - 1;
                }else {
                    start = mid+ 1;
                }
            }else {
                if(target >= array[mid] && target <= array[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {4,5,6,7,-1,0,1,2};
        int target = 0;
        int i = searchUsingLinear(array, target);
        System.out.println(i);

        int searchUsingBinary = searchUsingBinary(array, target);
        System.out.println(searchUsingBinary);
    }
}
