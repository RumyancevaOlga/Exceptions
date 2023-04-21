package Seminar3;

public class MyArrayDataException extends NumberFormatException {
    private int index;

    public int getIndex() {
        return index;
    }

    public MyArrayDataException(int index) {
        super(String.format("В ячейке %d отсутствуют данные или они некорректны", index));
        this.index = index;
    }
}
