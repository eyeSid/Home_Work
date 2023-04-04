package Lesson9.HW9;
//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getName - получить имя
//setName
//getBaseSalary - базовая ставка
//setBaseSalary
    public class Employee {
    private String name;
    private int baseSalary; // - базовая ставка

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
}
