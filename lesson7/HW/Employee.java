package lesson7.HW;
//Задача №2

//Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
// и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который
// возвращает true, если у сотрудника у которого был вызван метод и сотрудника
// который был передан как параметр, одинаковое имя.
public class Employee {

        String name;
        String gender;
        int age;
        Double salary;

        public boolean isSameName(Employee employee) {
            if (employee.name.equals(name)) {
                return true;
            } else {
                return false;
            }
        }





}
