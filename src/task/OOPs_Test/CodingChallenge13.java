package task.OOPs_Test;

public class CodingChallenge13 {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.displayOuter();

        Outer.Inner inner = outer.new Inner();
        inner.displayInner();
    }
}

class Outer{
    private int x = 10;

    public void displayOuter(){
        System.out.println("Outer class variable x: " + x);
    }
    class Inner{
        public void displayInner(){
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }
}
