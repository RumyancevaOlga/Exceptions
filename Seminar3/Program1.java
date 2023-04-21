package Seminar3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 1. Создайте класс исключения, который будет выбрасываться при делении на
// 0. Исключение должно отображать понятное для пользователя сообщение
// об ошибке.
// 2. Создайте класс исключений, которое будет возникать при обращении к
// пустому элементу в массиве ссылочного типа. Исключение должно
// отображать понятное для пользователя сообщение об ошибке
// 3. Создайте класс исключения, которое будет возникать при попытке открыть
// несуществующий файл. Исключение должно отображать понятное для
// пользователя сообщение об ошибке.

public class Program1 {
    public static void main(String[] args) throws MyFileNotFoundException {
        // int a = 3;
        // int b = 0;

        // try {
        //     int c = a / b;
        // } catch (ArithmeticException e) {
        //     throw new MyDivisionByZeroException(b);
        // }
        
        // Integer[] array = {1, 2, null, 3};

        // for (int i = 0; i < array.length; i++) {
        //     if(array[i] == null) {
        //         throw new MyArrayDataException(i);
        //     }
        //     System.out.println(array[i]);
        // }
        
        // String path = "G:/Домашнее задание GeekBrains/Exceptions/Seminar2/File.txt";
        String path = "test.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException(path);
        }
        
    }

}
