package HomeWork1;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен частному элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
// как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Task4 {
    public static void main(String[] args) {
        //в первом случае получим просто вывод результирующего массива
        // int[] arr1 = {2, 3, 4, 5};
        // int[] arr2 = {2, 2, 2, 2};

        //во втором получим наше сообщение Array lengths are not equal
        // int[] arr1 = {2, 3, 4};
        // int[] arr2 = {1, 1, 1, 1};

        //во третьем случае получим наше сообщение Error: division by zero
        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {0, 2, 2, 2};

        print(arrayQuotient(arr1, arr2));


        
    }

    public static double[] arrayQuotient (int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) { //проверяем на равенство
            throw new RuntimeException("Array lengths are not equal");
        }
        double[] result = new double [arr1.length];//если прошли проверку, едем дальше
        for (int i = 0; i < result.length; i++) {
            if(arr2[i] == 0) {//перехватываем деление на ноль
                throw new RuntimeException("Error: division by zero");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

     //вспомогательный метод вывода массива на экран
     public static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
