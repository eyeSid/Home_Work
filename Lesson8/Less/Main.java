package Lesson8.Less;


//  ВИДЫ объявления классов переменных и тд
//public - виден всем
//package - виден всем кто с ним в одной папке
//protected - виден наследникам
//private - не виден ни кому


public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "Sergey";
        worker.lastname = "D.";

        System.out.println(worker.lastname + worker.name);
    }
}
