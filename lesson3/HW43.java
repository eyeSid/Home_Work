package lesson3;

public class HW43 {
    //    Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//            Реализовать 2 варианта:
//    использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//    без использования конструкции if (шаг цикла на ваше усмотрение).

    public static void main(String[] args) {
        int a ;
        System.out.println("числа кратные 4:");
//        for (a = 1; a <= 60 ; a = a + 1) {
//            if (a >= 40) {
//                if (a % 4 == 0) {
//                    System.out.print(" " + a);
//                }
//            }
//        }
        System.out.println(" ");

            for (int b = 40; b <= 60 && b >= 40 ; b=b+4) {
                System.out.println(" " + b);

            }

//        System.out.println(" ");
//        System.out.println("var.2:");
//        int b = 39;
//        if (b < 60) {
//            b = b + 1;
//            if (b >= 40) {
//                if (b % 4 == 0) {
//                    System.out.print(" " + b);
//                }
//            }
    }
}