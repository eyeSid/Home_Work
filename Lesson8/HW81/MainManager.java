package Lesson8.HW81;

public class MainManager {
    public static void main(String[] args) {
        Manager petrov = new Manager();
        petrov.setName("Petrov");
        petrov.setAge(35);
        petrov.setGender("male");
        petrov.setSalary(100.0);
        petrov.setWorker(10);

        System.out.print(petrov.getSalary(5));
    }
}
