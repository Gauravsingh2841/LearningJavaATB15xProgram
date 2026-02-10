package task.OOPs_Test;

public class CodingChallenge5 {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

abstract class Animal{
    public abstract void makeSound();
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat says: Meow! Meow!");
    }
}
