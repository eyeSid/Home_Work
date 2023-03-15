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
                System.out.println("\n");
//---------------------------------------------------------------------------------------
//       если массив будет пустой то - int value = a[0]; - выдаст ошибку
//       для этого используем - int value2 = Integer.MAX_VALUE; - присвоение
//       значения переменной и Integer.MIN_VALUE - присвоение min значения переменной

        int[] a2 = {10, 2 , 3, 4, 8, 9};

        int value2 = Integer.MAX_VALUE; // - присвоение максимального значения переменной
        for (int i = 0; i < a2.length; i++) {
            if (value2 > a2[i]) {
                value2 = a2[i];
            }
        }
        System.out.println("наименьшее число массива а2 = " + value2);
        System.out.println("\n");




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
