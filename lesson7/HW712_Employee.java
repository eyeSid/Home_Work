package lesson7;

public class HW712_Employee {
    //Задача №2
    //Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
    //и поле зарплата. Класс должен иметь метод isSameName (Employee employee)
    //который возвращает true, если у сотрудника у которого был вызван метод и
    //сотрудника который был передан как параметр, одинаковое имя.
    //
    //Задача №3
    //Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
    //метод должен возвращать сумму зарплат всех сотрудников из массива
    //переданного в качестве аргумента вызова метода.

    String name;

    public HW712_Employee(String name) {
        this.name = name;
    }

    public String isSameName (String name1) {
        if (name1.equals(name)) {
            return "YES";
        }
        return "NO";


    }

}
