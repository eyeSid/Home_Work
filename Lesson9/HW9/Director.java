package Lesson9.HW9;

public class Director extends Manager{
    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
    @Override
    public int getSalary(){
        if (numberOfSubordinates == 0) {
            return getBaseSalary();
        } else {
            return (int)(getBaseSalary() * (numberOfSubordinates / 100.0 * 9));
        }
    }

}
