package Lesson9.HW9;
//Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
//
//в классе, метод getSalaryManager будет возвращать значение
// по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 3).
// Если количество подчиненных 0, то результат как у обычного рабочего.
public class Manager extends Employee{
    int numberOfSubordinates;

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary(){
        if (numberOfSubordinates == 0) {
            return getBaseSalary();
        } else {
            return (int)(getBaseSalary() * (numberOfSubordinates / 100.0 * 3));
        }
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
