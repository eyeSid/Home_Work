package lesson5;

import java.util.Arrays;

public class les5 {
    public static void main(String[] args) {
        System.out.print(" ЦИКЛЫ \n");

        System.out.print(" break - завершения цикла по условию, \n" +
                "continue пропуск шага цикла при совпадении условия\n");

        int i;
        for (i = 0; i < 16; i++) {

            if (i == 3 || i == 5) {
                continue;
                 }
            if (i == 8) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.print(" цикл в цикле \n");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.println("j=" + j + " k=" + k);
            }
        }


//             Новая тема


        System.out.print("\n");
        System.out.print(" МАССИВЫ \n");

        int [] array = {10, 100, 1000, 10000, 100000};
        System.out.println(array[0]); // - печать первого (0) элемента из массива
        System.out.println(array[4]); // - печать пятого (4) элемента из массива
        System.out.println("длинна массива - " + array.length );
        System.out.println("адрес массива array - " + array);
        System.out.println("значения массива array - " + Arrays.toString(array));
        System.out.print("\n");

        int [] arr2 = {22, 202, 2002, 20002, 200002};
        int [] arr3 = arr2;  // -  ссылки массивов arr3 и arr2 ведут на один адрес в памяти
        arr3[0] = 33;   // - присвоенние нулевому элементу значения 33
        System.out.println(arr2[0]);
        System.out.println("адрес массива arr2 - " + arr2);
        System.out.println("адрес массива arr3 - " + arr3);
        System.out.println("адрес массива arr3 тот же что и arr2 " + arr3);
        System.out.println("значения массива aar2 - " + Arrays.toString(arr2));
        System.out.print("\n");

        int [] arr4 = {10, 100, 1000, 10000, 100000};
        System.out.print("масив arr4\n");
        for (int l = 0; l < arr4.length; l++) {
            System.out.println(l + " - " + arr4[l]);
        }
        System.out.print("\n");

        int [] arr5 = new int[10];
        System.out.print("масив arr5\n");
        System.out.println("длинна массива - " + arr5.length );
        System.out.println("значения массива arr5 - " + Arrays.toString(arr5));
        //  - заполним массив степенью числа 5  и выведем результат
        for (int n = 0, p = 1; n < arr5.length;p *= 5, n++) {
            arr5[n] = p;
        }
        System.out.println(Arrays.toString(arr5));


//         - двумерный массив первая скобка [] - строки, вторая - положение в строке
//        -         int [][] arr6 = { {11, 12, 13}, {21, 22, 23}, {31, 32, 33} };

        int [][] arr6 = {
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33}
        };
        System.out.print("масив arr5\n");
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.deepToString(arr6));
        System.out.println( arr6[0][2]);
        for (int m = 0; m < arr6.length; m++) {
            System.out.println(arr6[m]);
        }
        for (int j = 0; j < arr6.length; j++) {
            for (int k = 0; k < arr6[j].length; k++) {
                System.out.print(" " + arr6 [j][k]);
            }            
        }
        System.out.print("\n");




    }
}
