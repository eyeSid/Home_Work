package Lesson8.HW81;
//Задача №1
//
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(int days), метод возвращает зарплату
// за количество дней которые были переданы в качестве аргумента.
public class MainEmployee {

    public static void main(String[] args) {


        Employee tata = new Employee();
        tata.setSalary(10);
        tata.getSalary(10);
        System.out.println(tata.getSalary());
    }
}
