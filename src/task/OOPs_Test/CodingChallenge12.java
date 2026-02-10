package task.OOPs_Test;

public class CodingChallenge12 {
    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();

        parent.display();
        child.display();
    }
}

class Parent{
    public void display(){
        System.out.println("Parent class display method");
    }
}

class Child extends Parent{
    @Override
    public void display(){
        System.out.println("Child class display method");
    }
}
