package ex_19_OOPs_Part2.OOPs_01_inheritance;

public class Problem {
    public static void main(String[] args) {
        Animal a = new Dog2();
        a.sound();
    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
