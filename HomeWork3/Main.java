public class Main {
    public static void main(String[] args) {
        DataConversion newData = new DataConversion(new GetInformation());
        // для себя вывод в консоль
        System.out.println(newData.getTelephone() + " " + newData.getSex() + " " + newData.getBirthday() + " " + newData.getFio());
        CreateFile cFile = new CreateFile(newData);
        cFile.write();
    }
}
