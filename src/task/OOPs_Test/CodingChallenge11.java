package task.OOPs_Test;

public class CodingChallenge11 {
    public static void main(String[] args){
        Addition addition = new Addition();
        addition.add(5, 3);
        addition.add(2.5, 3.7);
        addition.add(1, 2, 3);
    }
}

class Addition{
    public void add(int a, int b){
        System.out.println("Integer addition: " + (a+b));
    }

    public void add(double x, double y){
        System.out.println("Double addition: " + (x+y));
    }

    public void add(int a, int b, int c){
        System.out.println("Three integers addition: " + (a+b+c));
    }
}
