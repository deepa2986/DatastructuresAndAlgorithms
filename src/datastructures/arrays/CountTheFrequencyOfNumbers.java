package datastructures.arrays;



public class CountTheFrequencyOfNumbers {

    public static int countTheFrequencyByLinearSearch(int[] array,int target){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                count++;
            }
        }
        return count;
    }

    public static int countTheFrequencyByBinarySearch(int[] array, int target){
        int firstIndex = getFirstIndex(array,target);
        int lastIndex = getLastIndex(array,target);
        return (lastIndex - firstIndex) + 1;
    }

    private static int getFirstIndex(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int index = -1;
        while(start <= end){
            int mid = (start+end)/2;
            if(array[mid] == target){
                index = mid;
                end = mid - 1;
            }else if(array[mid] > target){
                end = mid - 1;
            }else start = mid + 1;
        }
        return index;
    }

    private static int getLastIndex(int[] array, int target) {
        int start = 0;
        int end = array.length;
        int index = -1;
        while (start <= end){
            int mid = (start+end)/2;
            if(array[mid] == target){
                index = mid;
                start = mid + 1;
            }else if(array[mid] > target){
                end = mid - 1;
            }else start = mid + 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1,4,7,8,8,11,11,11,11,12,13};
        int target = 11;
        int count = countTheFrequencyByLinearSearch(array, target);
        System.out.println(count);

        int frequency = countTheFrequencyByBinarySearch(array,target);
        System.out.println(frequency);
    }
}
