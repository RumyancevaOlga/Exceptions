package Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Application {
    
    public static void main(String[] args) {

        //NullPointer
        // String name = null;
        // System.out.println(name.length());

        //ClassCast
        // Object object = new String("123");
        // File file = (File) object;
        // System.out.println(file);

        //NumberFormat
        // String number = "123fq";
        // int result = Integer.parseInt(number);
        // System.out.println(result);

        //UnsupportedOperation
        // List<Object> emptyList = Collections.emptyList();
        // emptyList.add(new Object());

        // int number = 1;
        // try {
        //     number = 10 / 0;
        //     String test = null;
        //     // System.out.println(test.length());
        //     Collections.emptyList().add(new Object());
        // }
        // // catch (Exception e) {}
        //  catch (ArithmeticException e) {
        //     System.out.println("Operation divide by zero not supported");
        // } catch (NullPointerException e) {
        //     System.out.println("NullPointer exception");
        // } catch (Exception e) {
        //     System.out.println("Exception");
        // }
        // System.out.println(number);
        
        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) { //Exception !=RunTimeException
            System.out.println("Catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Exception while close");
                }
                
            }
            System.out.println("Finally finished");
        }
        
    }
}
