package task.OOPs_Test;

public class CodingChallenge8 {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}

abstract class Shape{
    public abstract double getArea();
}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double getArea(){
        return (length*width);
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return (Math.PI*radius*radius);
    }
}