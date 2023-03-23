package lesson7.HW;
//Задача №1
//Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
// если пол указан как мужской и префикс “Mrs. ” если женский.
public class Person {
    public static void main(String[] args) {
        Data bill = new Data();
        bill.name = "Bill";
        bill.age = 45;
        bill.gender = "man";

        Data sisil = new Data();
        sisil.name = "Sisil";
        sisil.age = 5;
        sisil.gender = "woman";

        Data suzi = new Data();
        suzi.name = "Suzi";
        suzi.age = 52;
        suzi.gender = "woman";

        System.out.println("Data: " + bill.getName());
        System.out.println("Data: " + sisil.getName());
        System.out.println("Data: " + suzi.getName());
    }
}
