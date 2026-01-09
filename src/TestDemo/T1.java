package TestDemo;

public class T1 {
    public static void main(String[] args){
        String s = "Automation";
        String s1 = "";
        for(int i = s.length()-1; i>=0; i--)
        {
            s1 += s.charAt(i); // s1 = s1+s.charAt(i);
        }
        System.out.println(s1);
    }
}
