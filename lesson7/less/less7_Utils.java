package lesson7.less;

public class less7_Utils {
    void printSum(int first, int second) {
        int s = sum(first, second);
        System.out.println("sum = " + s);
    }
    int sum(int firstSummand, int secondSummand) {
        int sum = firstSummand + secondSummand;

        return sum;
    }

    void sumOfThree(int ferstValue, int secondValue, int thirdValue) {
        System.out.println("sum of 3 = " + (ferstValue + secondValue + thirdValue));
    }
    void div(int ky, int py) {
        double div = 1.0 * ky / py;
        System.out.println("div = " + div);
    }
}
