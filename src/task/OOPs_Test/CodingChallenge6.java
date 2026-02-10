package task.OOPs_Test;

public class CodingChallenge6 {
    public static void main(String[] args){
        Vehicle[] vehicles = {new Car(), new Bike()};
        for(Vehicle vehicle : vehicles){
            vehicle.start();
        }

    }
}

abstract class Vehicle{
    public abstract void start();
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike engine starts with a purr!");
    }
}
