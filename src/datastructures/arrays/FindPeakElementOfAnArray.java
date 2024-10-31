package datastructures.arrays;

public class FindPeakElementOfAnArray {

    public static int getPeakElementOfAnArray(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if((mid == 0 || array[mid - 1] <= array[mid])
                    && (mid == array.length - 1 || array[mid] >= array[mid+1])){
                return array[mid];
            }else if(mid > 0 && array[mid - 1] > array[mid]){
                end = mid - 1;
            }else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,7,5};
        int peakElementOfAnArray = getPeakElementOfAnArray(array);
        System.out.println(peakElementOfAnArray);

    }
}
