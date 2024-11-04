package datastructures.arrays;

public class FindTheElementAppearOnce {

    public static int findTheElement(int[] array){
        if(array.length == 0){
            return -1;
        }
        if(array.length == 1){
            return array[0];
        }
        int i = 0;
        while (i < array.length){
            if(array[i] != array[i+1]){
                return array[i];
            }
            i = i + 2;
        }
        return array[i];
    }

    public static int findTheElementOptimised(int[] array){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = (start + end)/2;
            if(start == end){
                return array[start];
            }else if(mid % 2 != 0){
                if(array[mid - 1] == array[mid]){
                    start = mid + 1;
                }else end = mid - 1;
            }else if(array[mid] == array[mid+1]){
                start = mid + 2;
            }else end = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,4,5,5};
        int element = findTheElement(array);
        System.out.println(element);

        int output = findTheElementOptimised(array);
        System.out.println(output);

    }
}
