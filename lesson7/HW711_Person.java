package lesson7;

public class HW711_Person {
//Задача №1
//Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
// если пол указан как мужской и префикс “Mrs. ” если женский.
    public static void main(String[] args) {
        HW711_getName bill = new HW711_getName();
        bill.name = "Bill";
        bill.age = 45;
        bill.gender = "man";

        HW711_getName sisil = new HW711_getName();
        sisil.name = "Sisil";
        sisil.age = 5;
        sisil.gender = "woman";

        HW711_getName suzi = new HW711_getName();
        suzi.name = "Suzi";
        suzi.age = 52;
        suzi.gender = "woman";

        System.out.println("Data: " + bill.getName());
        System.out.println("Data: " + sisil.getName());
        System.out.println("Data: " + suzi.getName());
    }
}
