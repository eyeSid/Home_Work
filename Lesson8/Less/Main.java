package Lesson8.Less;


//  ВИДЫ объявления классов переменных и тд
//public - виден всем
//package - виден всем кто с ним в одной папке
//protected - виден наследникам
//private - не виден ни кому


public class Main {
    public static void main(String[] args) {
        Person w1 = new Person("D.","Sergey", 30);
//        w1.setName("Sergey");
//        w1.setLastname("D.");

        Person w2 = new Person("S.","Sergey",32);
//        w2.setName("Sergey");
//        w2.setLastname("S.");

        System.out.println(w1.getLastname() + w1.getName());
        System.out.println(w2.getLastname() + w2.getName());
    }
}
