import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class DataConversion {
    
    private GetInformation data;
    private Fio fio;
    private Birthday birthday;
    private Sex sex;
    private Telephone telephone;
   
    public DataConversion(GetInformation data) {
        this.data = data;
        setTelephone(telephone);
        setSex(sex);
        setBirthday(birthday);
        setFio(fio);
    }

    private boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.UnicodeBlock.of(s.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC) || s.charAt(i) == '-') {
                return true;
            }
        }
        return false;
    }

    public Fio getFio() {
        return fio;
    }

    private void setFio(Fio fio) {
        int counter = 0;
        for (int i = 0; i < data.getParseData().length; i++) {
            if(isValid(data.getParseData()[i]) && i + 2 < data.getParseData().length && isValid(data.getParseData()[i + 1]) && isValid(data.getParseData()[i + 2])) {
                this.fio = new Fio(data.getParseData()[i], data.getParseData()[i + 1], data.getParseData()[i + 2]);
                counter++;
            }
        }
        if (counter == 0) {
            throw new NumberFormatException("В введенных данных нет ФИО в формате Фамилия Имя Отчество!");
        }
    }

    public Birthday getBirthday() {
        return birthday;
    }

    private void setBirthday(Birthday birthday) {
        int counter = 0;
        for (int i = 0; i < data.getParseData().length; i++) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
                this.birthday = new Birthday(LocalDate.parse(data.getParseData()[i], formatter));
            } catch (DateTimeParseException e) {
                counter++;
                continue;
            }
        }
        if (counter == data.getParseData().length) {
            throw new NumberFormatException("В введенных данных нет дня рождения в формате dd.mm.yyyy!");
        } 
    }

    public Sex getSex() {
        return sex;
    }

    private void setSex(Sex sex) {
        int counter = 0;
        for (int i = 0; i < data.getParseData().length; i++) {
            if(data.getParseData()[i].equals("f") || data.getParseData()[i].equals("m")) {
                 this.sex = new Sex(data.getParseData()[i].charAt(0));
                counter++;
            }
        }
        if (counter == 0) {
            throw new NumberFormatException("В введенных данных не указан пол в формате символов f или m!");
        } 
    }

    public Telephone getTelephone() {
        return telephone;
    }

    private void setTelephone(Telephone telephone) {
        int counter = 0;
        for (int i = 0; i < data.getParseData().length; i++) {
            try {
                this.telephone = new Telephone(Long.parseLong(data.getParseData()[i]));
            } catch (NumberFormatException e) {
                counter++;
                continue;
            }
        }
        if (counter == data.getParseData().length) {
            throw new NumberFormatException("В введенных данных нет номера телефона в формате целого числа без знаков!");
        } 
    }

}
