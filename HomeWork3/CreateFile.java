import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class CreateFile {
    
    private DataConversion data;

    public CreateFile(DataConversion data) {
        this.data = data;
    }

    private  String getString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String birthday = this.data.getBirthday().getBirthday().format(formatter);
        String string = this.data.getFio().getSurname() + " " + this.data.getFio().getName() + " " +
                        this.data.getFio().getPatronymic() + " " + birthday + " " + 
                        this.data.getTelephone().getTelephone() + " " + this.data.getSex().getSex() + "\n";
        return string;
    }

    public void write() {
        String path = this.data.getFio().getSurname();

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(path, true));
            bf.write(getString());
            bf.close();
        } catch (IOException e) {
            new IOException("Ошибка записи в файл");
        }
    }
}
