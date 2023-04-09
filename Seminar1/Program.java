package Seminar1;

public class Program {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int length = arrayLength(array);
        if (length < 0) {
            System.out.println("Length of array less then minimum");
        } else {
            System.out.println("Length of array: " + length);
        }
    }

    static int arrayLength(int[] array) {
        if(array.length < 2) {
            return -1;
        }
        return array.length;
    }
}
