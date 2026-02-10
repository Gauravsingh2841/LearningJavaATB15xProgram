package task.OOPs_Test;

public class CodingChallenge10 {
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}

interface Flyable{
    public abstract void fly();
}

interface Swimmable{
    public abstract void swim();
}

class Duck implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim(){
        System.out.println("Duck is swimming in the water!");
    }
}