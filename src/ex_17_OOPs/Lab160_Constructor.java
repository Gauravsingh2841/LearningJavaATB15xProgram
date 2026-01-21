package ex_17_OOPs;

public class Lab160_Constructor {

    public static void main(String[] args) {
        Animal dog = new Animal();
        MySQL a = new MySQL();
        ReadExcelFile e = new ReadExcelFile();

    }

}

class MySQL {
    MySQL() {
        System.out.println("MySQL Connected!");
    }
}

class ReadExcelFile {
    ReadExcelFile() {
        System.out.println("ExcelFile is Loaded!");
    }
}
