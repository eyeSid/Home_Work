package lesson6;

public class HW61 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        // ЗАДАЧА №1 необходимо вывести сумму всех значений массива
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            b += array[i];
        }
        System.out.println("ЗАДАЧА №1\nнеобходимо вывести сумму всех значений массива");
        System.out.println("summa: " + b);

        //ЗАДАЧА №2       необходимо вывести максимальное значение массива
        int c = array[1];
        for (int i = 0; i < array.length; i++) {
            if (c < array[i]) {
                c = array[i];
            }
        }
        System.out.println("ЗАДАЧА №2\nнеобходимо вывести максимальное значение массива");
        System.out.println("max: " + c);

        //Задача №3        //необходимо вывести минимальное значение массива
        int d = array[1];
        for (int i = 0; i < array.length; i++) {
            if (d > array[i]) {
                d = array[i];
            }
        }
        System.out.println("ЗАДАЧА №3\nнеобходимо вывести минимальное значение массива");
        System.out.println("min: " + d);

        //Задача №4        //необходимо вывести среднее арифметическое всех значений массива.
        int f = 0;
        for (int i = 0; i < array.length; i++) {
            f += array[i];
        }
        System.out.println("ЗАДАЧА №4\nнеобходимо вывести среднее арифметическое всех значений массива");
        System.out.println("среднее арифметическое: " + f/ array.length);

        //Задача №5
        //Дан массив: int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        int max = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (max < array2[i][j]) {
                    max = array2[i][j];
                }
                sum2 += array2[i][j];
            }
        }
        System.out.println("ЗАДАЧА №5\nнеобходимо вывести сумму элементов массива");
        System.out.println("сумма массива array2 = " + sum2);
//        Задача №6 необходимо вывести максимальное значение массива.
        System.out.println("ЗАДАЧА №6\nнеобходимо вывести максимальное значение массива");
        System.out.println("max array2 = " + max);








    }
}
