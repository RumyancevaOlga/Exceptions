package Seminar1;

import java.util.ArrayList;
import java.util.List;

// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
// Метод должен пройтись по каждому элементу и проверить что он не равен null. 
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class Program4 {
    
    public static List checkArray(Integer[] arr) {
        List list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null) {
                // System.out.println("Элемент " + i + " = null");
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        
        Integer[] arr = {1, null, 5, 6};
        List list = checkArray(arr);
        if(list.size() > 0) {
            System.out.println("В массиве есть null элементы под индексами:" + list);
        } else {
            System.out.println("В массиве нет элементов = null");
        }
    }
}
