package datastructures.arrays;

public class Segregate0And1 {

    public static void segregate0And1(int[] array){
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                array[j++] = array[i];
            }
        }
        while (j < array.length){
            array[j++] = 1;
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] array = {1,0,0,1,1,0,1,0,0};
        segregate0And1(array);
    }
}
