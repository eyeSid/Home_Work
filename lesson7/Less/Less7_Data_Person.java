package lesson7.Less;

public class Less7_Data_Person {
    public static void main(String[] args) { // - args - это параметр

// переменная объявляется внутри метода ( john и jane )
        Less7_Person john = new Less7_Person();
        john.name = "John Doe";
        john.age = 35;

        Less7_Person jane = new Less7_Person();
        jane.name = "John Doe";
        jane.age = 35;

        System.out.println(john.getFullInfo()); // - это аргумент
        System.out.println(jane.getFullInfo()); // - "в печать я передаю аргумент Джейн"
    }
}
