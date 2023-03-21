package Lesson8;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "Sergey";
        worker.lastname = "D.";

        System.out.println(worker.lastname + worker.name);
    }
}
