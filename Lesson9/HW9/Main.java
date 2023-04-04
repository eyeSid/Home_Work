package Lesson9.HW9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Worker bob = new Worker("Bob",500);
        Worker sem = new Worker("Sem",600);

        Manager stiv = new Manager("Stiv", 500,1);
        Director vasy = new Director("Vasy", 500, 1);
        System.out.println("worker Bob - " + bob.getSalary());
        System.out.println("manager Stiv - " + stiv.getSalary());
        System.out.println("director Vasy - " + vasy.getSalary());

        Employee[] people = {bob, sem, stiv, vasy};
        String[] names = new String[people.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = people[i].getName();

        }
        System.out.println(Arrays.toString(names));

        Utils a = new Utils();
        Worker[] workers = {bob, sem};
        System.out.println(a.findMaxSalary(workers));

    }
}
