package datastructures.arrays;

public class CommonElements {

    public static void getCommonElements(int[] array1,int[] array2, int[] array3){
        int x = 0, y = 0, z = 0;
        while(x < array1.length && y < array2.length && z < array3.length) {
            if(array1[x] == array2[y] && array2[y] == array3[z]){
                System.out.print(array1[x] +" ");
                x++;
                y++;
                z++;
            }else if(array1[x] < array2[y]){
                x++;
            }else if(array2[y] < array3[z]){
                y++;
            }else {
                z++;
            }
        }
    }
    public static void main(String[] args) {

        int[] array1 = {1,2,10,45,80};
        int[] array2 = {1,9,20,45,80,};
        int[] array3 = {1,5,3,10,45,80};
        getCommonElements(array1,array2,array3);

    }
}
