package Lesson8.HW82;

public class Manager extends BaseManager{
    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryManager(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return (int)(getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }


}
