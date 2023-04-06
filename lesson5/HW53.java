package lesson5;

public class HW53 {
    public static void main(String[] args) {
/*        Задачи на циклы, вывести следующие строки с соответствующим форматированием (как пирамиды):

        Задача №3

        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
              6 5 4 3 2 1 0 1 2 3 4 5 6
                5 4 3 2 1 0 1 2 3 4 5
                  4 3 2 1 0 1 2 3 4
                    3 2 1 0 1 2 3
                      2 1 0 1 2
                        1 0 1
                          0
 */
        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = i - 1; k >= 0; k--) {
                System.out.print(k + " ");
            }
//            for (int l = 1; l < i; l++) {
//                 System.out.print(l + " ");
//            }
                System.out.println();
            }
        }
    }

