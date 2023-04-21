
import java.io.IOException;


// Создайте класс Счетчик, у которого есть метод add(), 
// увеличивающий значение внутренней int переменной на 1. 
// Сделайте так, чтобы с объектом такого типа можно было работать в блоке 
// try-with-resources. Подумайте, что должно происходить при закрытии этого ресурса? 
// Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого 
// ресурса, должен выброситься IOException


public class Counter implements AutoCloseable{

    private int iterator;
    private boolean isClosed;

    public boolean isClosed() {
        return isClosed;
    }

    public Counter() {
        super();
        this.isClosed = false;
    }

    @Override
    public void close() throws Exception {
        this.iterator = 0;
        this.isClosed = true;
        System.out.println("Closed");
    }

    public void add() throws Exception{
        thisIsClosed();
        this.iterator++;
        System.out.println("add");
    }

    public void thisIsClosed() throws Exception {
        if (this.isClosed) {
            System.out.println("IOException");
            throw new IOException("IOException");
        }
    }

    public static void main(String[] args) {
        try (Counter one = new Counter()) {
            one.add();
            one.add();
            one.close();
            one.add();
        } catch (IOException e) {
            new IOException(e);
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }
    
}


