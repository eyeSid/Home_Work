package lesson7.HW;
//Задача №1
//Необходимо создать класс Person с полями: имя, возраст, пол.
// Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ”
// если пол указан как мужской и префикс “Mrs. ” если женский.
public class Data {
    String name;
    String gender;
    int age;
    Double salary;
    String getName () {
        if (gender == "woman") {
            if (age > 30) {
                return "Mrs. " + name;
            } else {
                return "Ms. " + name;
            }
        } else {
            return "Mr. " + name;
        }
    }
}
