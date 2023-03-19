package lesson7;

public class less7 {
    // переместили МЕТОДЫ sum и sumOfThree в соседний класс less7_Utils

//      public static void sum(int first, int second) {
//        int sum = first + second;
//        System.out.println("sum = " + sum);
//    }

//    public static void sumOfThree(int ferstValue, int secondValue, int thirdValue) {
//        System.out.println("sum of 3 = " + (ferstValue + secondValue + thirdValue));
//    }

    public static void main(String[] args) {

        less7_Utils ani = new less7_Utils();

        int a = 10;
        int b = 11;
//        int sum = a + b;
//        System.out.println("sum=" + sum);
        ani.printSum(a, b);
//----------------
        int c = 12;
        int d = 13;
//        int sum2 = c + d;
//        System.out.println("sum2=" + sum2);
        ani.printSum(c, d);
        ani.sumOfThree(c, d, a);
//-----------------
        ani.printSum(1, 2 * 3);
        ani.printSum(1, 2 * 3 + a - b);
//-----------------
        ani.div(c * d, a);
    }

}
