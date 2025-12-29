package task;

public class Task_IncreDecre {
    public static void main(String[] args){
        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

        int a1 = 3;
        int b = a1++ * ++a1;
        System.out.println(b);

        int a2 = 5;
        System.out.println(a2++ + a2--);
    }
}
