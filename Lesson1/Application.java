import java.io.File;

public class Application {
    public static void main(String[] args) {
        
        System.out.println(getFileSize(new File("G:/Домашнее задание GeekBrains/Algorithms/Lesson4/RedBlackTree.java")));
        System.out.println(divide(10, 0));

        // a();

        System.out.println(divide2(10, 0));
    }

    public static int divide2(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Divide by zero not permitted");
        }
        return a1/a2;
    }

    public static void a() {
        b();
    }

    public static void b(){
        c();
    }

    public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }

    public static int divide(int a1, int a2) {
        if(a2 == 0) {
            return -1;
        }
        return a1/a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1;
        }
        return file.length();
    }
}
