package Seminar3;

import java.io.FileNotFoundException;

public class MyFileNotFoundException extends FileNotFoundException{
    private String path;

    public String getPath() {
        return path;
    }

    public MyFileNotFoundException(String path) {
        super(String.format("Попытка открыть несуществующий файл: %s", path));
        this.path = path;
    }
}
