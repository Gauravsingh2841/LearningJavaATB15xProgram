package TestDemo;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public static void main(String[] args){
        String name = "Gaurav";
        System.out.println(name.charAt(3));
        System.out.println(name.length());
        System.out.println(name.charAt(name.length()-2));

        List<String> abc = new ArrayList<>();
        abc.add("Gaurav");
        abc.add("Kajal");
        System.out.println(abc.size());
        System.out.println(abc.get(0));
    }
}
