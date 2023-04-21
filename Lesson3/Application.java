package Lesson3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("G:/Домашнее задание GeekBrains/Exceptions/Seminar2/File.txt");
            FileWriter writer = new FileWriter("test")) {
            while(reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
    }
   
}
