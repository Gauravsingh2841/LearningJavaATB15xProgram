package ex_17_OOPs;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("mufasa");
        Cat c3 = new Cat("lucy");
        Cat c4 = new Cat("spicy");
        Cat c5 = new Cat("oggy");

        System.out.println(c2.name);
        System.out.println(c3.name);



    }
}

class Cat{
    String name;

    Cat(){
        System.out.println("DC");
        System.out.println(this.name);

    }

    Cat(String nameGiven){
        this.name = nameGiven;
    }

    void running() {
        int local_var = 10; // Local variable
        System.out.println("Who is running -> " + this.name);
    }




}
