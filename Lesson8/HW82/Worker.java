package Lesson8.HW82;

public class Worker extends Employee{
    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }
    public int getSalaryWorker(){
        return getBaseSalary();
    }

}
