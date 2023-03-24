package Lesson8.Less;

public class Worker extends Person{
    int salary;

    public Worker(String lastname, String name, int age, int salary) {
        super(lastname, name, age);
        this.salary = salary;
    }

//    public Worker(String lastname, String name, int age) {
//        super(lastname, name, age);
//    }
}
