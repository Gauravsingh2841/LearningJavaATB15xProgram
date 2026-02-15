package ex_Exceptions.CF_01_LIST;

import java.util.Arrays;
import java.util.List;

public class LabConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"Java","Python","C#"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
