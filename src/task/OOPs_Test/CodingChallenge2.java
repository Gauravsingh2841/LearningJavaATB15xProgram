package task.OOPs_Test;

public class CodingChallenge2 {
    public static void main(String[] args){
        Student s = new Student("Bob",101,"A");
        s.displayStudentDetails();
    }
}

class Student{
    String name, section;
    int rollNo;
    public Student(String name, int rollNo, String section)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.section=section;
    }

    public void displayStudentDetails(){
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}
