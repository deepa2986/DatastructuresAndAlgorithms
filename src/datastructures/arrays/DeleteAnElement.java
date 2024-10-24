package datastructures.arrays;

public class DeleteAnElement {

    public static void deleteElement(int[] array, int position) {
        int length = array.length - 1;
        if (position < 0 || position > length) {
            System.out.println("Invalid position");
        } else {
            for (int i = position - 1; i < length; i++) {
                array[i] = array[i + 1];
            }
            length--;
            for (int i = 0; i <= length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static void main(String[] args) {

        int[] array = {2,4,3,1,6,7,5};
        int position = 2;
        deleteElement(array,position);
    }
}
