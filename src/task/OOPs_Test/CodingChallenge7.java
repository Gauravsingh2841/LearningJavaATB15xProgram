package task.OOPs_Test;

public class CodingChallenge7 {
    public static void main(String[] args){
        EmployeeBase manager = new Manager(60000, 10000);
        EmployeeBase developer = new Developer(50, 160);

        manager.salaryCalculated();
        developer.salaryCalculated();
    }
}

abstract class EmployeeBase{
    public abstract void salaryCalculated();
}

class Manager extends EmployeeBase{
    double salary;
    double bonus;
    public Manager(double baseSalary, double bonus){
        this.salary=baseSalary;
        this.bonus=bonus;
    }

    @Override
    public void salaryCalculated(){
        System.out.println("Manager Salary: " + (salary+bonus));
    }
}

class Developer extends EmployeeBase{
    double hourlyRate;
    double hours;
    public Developer(double hourlyRate, double hours){
        this.hourlyRate=hourlyRate;
        this.hours=hours;
    }

    @Override
    public void salaryCalculated(){
        System.out.println("Developer Salary: " + (hourlyRate*hours));
    }
}
