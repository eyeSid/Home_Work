package lesson7.HW;

public class DataSalary {
    public static void main(String[] args) {
        double[] salary = {1.0, 2.2, 3.3, 4.0};
        Salary x = new Salary();
        double q;
        q = x.getSum(salary);
        System.out.println("sum salary: " + q);

    }
}