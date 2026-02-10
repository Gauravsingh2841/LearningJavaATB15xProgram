package task.OOPs_Test;

class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CodingChallenge1{
    public static void main(String[] args){
        Person p1 = new Person("John",25);
        Person p2 = new Person("Alice",30);

        p1.displayDetails();
        p2.displayDetails();
    }
}
