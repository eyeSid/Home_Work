package Lesson8.HW81;

//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и
// количество подчиненных. Все поля сделать приватными и для каждого поля
// добавить методы set и get. Класс должен иметь метод - getSalary(int days),
// метод возвращает зарплату за количество дней которые были переданы в
// качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
public class Manager {

    private String name;
    private int age;
    private String gender;
    private double salary;
    private int worker;

    public double getSalary(int days) {
        salary = days * salary + salary * worker * 0.01;
        return salary;
    }

    public String getName() {
        return name;
    }
     public void setName(String name){
         this.name = name;
     }
     public int setAge() {
        return age;
     }
     public void setAge (int age) {
        this.age = age;
     }
     public String getGender() {
        return gender;
     }
     public void setGender(String gender) {
        this.gender = gender;
     }
     public double getSalary() {
        return salary;
     }
     public void setSalary(double salary) {
        this.salary = salary;
     }
     public int getWorker() {
        return worker;
     }
     public void setWorker(int worker) {
        this.worker = worker;
     }
}
