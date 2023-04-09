package Seminar1;

/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив
 * и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс.
 * При этом, например:
 * 
 * 1. Если длина массива меньше некоторого заданного минимума, метод 
 * возвращает -1, в качестве кода ошибки
 * 2. Если искомый элемент не найден, метод вернет -2 в качестве кода ошибки
 * 3. Если вместо массива пришел null, метод вернет -3
 * 4. Придумайте свои варианты исключительных ситуаций и верните соответствующие коды 
 * ошибок.
 * 
 * Напишите метод main c описанием ошибки
 */

public class Program2 {

    public static void main(String[] args) {
        int[] array = null;
        int error = method(array, 3);
        if (error >= 0) {
            System.out.println("Index = " + error);
        } else if (error == -1){
            System.out.println("Length of array < 2");
        } else if (error == -2) {
            System.out.println("Value not found");
        } else if (error == -3) {
            System.out.println("Array = null");
        }
    }
    
    public static int method(int[] array, int value) {
        if(array == null){
            return -3;
        } 
        if (array.length < 2) {
            return -1;
        } 
        for (int j = 0; j < array.length; j++) {
            if(array[j] == value) {
                return j;
            }
        }
        return -2;
    }
}


// public static int findElement(int[] array, int value) {
//     if (array == null) {
//         return -3;
//     }
//     if (array.length < MINSIZE) {
//         return -1;
//     }
//     for (int i = 0; i < array.length; i++) {
//         if (array[i] == value) {
//             return i;
//         }
//     }
//     return -2;
// }

// public static void userInterface(int answer) {
//     switch (answer) {
//         case -1 -> System.out.println("Длинна массива меньше " + MINSIZE);
//         case -2 -> System.out.println("Искомый элемент не найден");
//         case -3 -> System.out.println("Массива не существует");
//         default -> System.out.println("Индекс искомого элемента равен " + answer);
//     }
// }
// private static final int MINSIZE = 5;
