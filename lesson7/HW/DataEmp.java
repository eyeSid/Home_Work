package lesson7.HW;
//Необходимо создать класс Employee с полями как у Person (из предыдущего задания)
// и поле зарплата. Класс должен иметь метод isSameName(Employee employee) который
// возвращает true, если у сотрудника у которого был вызван метод и сотрудника
// который был передан как параметр, одинаковое имя.
public class DataEmp {
    public static void main(String[] args) {

        Employee bill = new Employee();
        bill.name = "Bill";
        bill.age = 45;
        bill.gender = "man";

        Employee sisil = new Employee();
        sisil.name = "Sisil";
        sisil.age = 5;
        sisil.gender = "woman";

        Employee suzi = new Employee();
        suzi.name = "Suzi";
        suzi.age = 52;
        suzi.gender = "woman";

        Employee billi = new Employee();
        billi.name = "Bill";
        billi.age = 45;
        billi.gender = "man";

        System.out.println(bill.isSameName(sisil));
        System.out.println(bill.isSameName(billi));

    }
}
