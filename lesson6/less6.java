package lesson6;

public class less6 {
    public static void main(String[] args) {
        int[] a = {10, 2 , 3, 4, 1, 9};

        int value = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (value > a[i]) {
                value = a[i];
            }
            sum += a[i];
        }
        System.out.println("наименьшее число массива а = " + value);
        System.out.println("sum a = " + sum);

        int[][] b = {{10, 2} , {3, 4, 1}, {}, {4}};
        int sum2 = 0;
        int min = b[0][0];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (min > b[i][j]) {
                    min = b[i][j];
                }
                sum2 += b[i][j];
            }
        }
        System.out.println("min b = " + min);
        System.out.println("сумма массива b = " + sum2);













    }
}
