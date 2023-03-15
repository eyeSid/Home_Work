package lesson5;

public class HW52 {
    public static void main(String[] args) {
//        Задачи на циклы, вывести следующие строки с соответствующим форматированием (как пирамиды):
//        Задача №2
//  0 1 2 3 4 5 6 7 8 9
//    0 1 2 3 4 5 6 7 8
//      0 1 2 3 4 5 6 7
//        0 1 2 3 4 5 6
//          0 1 2 3 4 5
//            0 1 2 3 4
//              0 1 2 3
//                0 1 2
//                  0 1
//                    0

        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
