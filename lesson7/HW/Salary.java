package lesson7.HW;

public class Salary {
    public double getSum(double[] massiv) {
        int sum = 0;
        for (int i = 0; i < massiv.length; i++) {
            sum += massiv[i];

        }
        return sum;
    }
}
