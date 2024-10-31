package datastructures.arrays;

public class FindTheFirstAndLastIndexOfAnElement {

    public static void getFirstAndLastIndex(int[] array,int search){
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == search && firstIndex == -1){
                firstIndex = i;
            }
            if(array[i] == search && firstIndex != -1){
                lastIndex = i;
            }
        }
        System.out.println("firstIndex : " + firstIndex);
        System.out.println("lastIndex : " + lastIndex );
    }

    public static int getFirstIndex(int[] array,int target){
        int start = 0;
        int end = array.length - 1;
        int index = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(array[mid] == target){
                index = mid;
                end = mid - 1;
            }else if(array[mid] > target){
                end = mid - 1;
            }else start = mid + 1;
        }
        return index;
    }

    public static int getLastIndex(int[] array, int target){
        int start  = 0;
        int end = array.length - 1;
        int index = -1;
        while (start <= end){
            int mid = (start + end)/2;
            if(array[mid] == target){
                index = mid;
                start = mid + 1;
            }else if (array[mid] > target){
                end = mid - 1;
            }else start = mid + 1;
        }
        return index;
    }

    public static void getFirstAndLastIndexOptimised(int[] array,int target){
        int firstIndex = getFirstIndex(array,target);
        int lastIndex = getLastIndex(array, target);
        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }
    public static void main(String[] args) {

        int[] array = {1,4,7,8,8,11,11,11,11,12,13,13};
        int search = 11;
        getFirstAndLastIndex(array,search);
        getFirstAndLastIndexOptimised(array,search);
    }
}
