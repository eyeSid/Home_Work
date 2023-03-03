package lesson3;

    public class lesson31 {
        public static void main(String[] args) {
            System.out.println("1:");

            byte a = (byte) 128;
            System.out.println(a);
            int b = 3;
            b = b + a;

            System.out.println("2:");
            System.out.println("b=" + b);

            int с = -125;

            System.out.println("3:");
            if (с == b) {
                System.out.println("с  равно b");
            } else if (с % 2 == 0) {
                System.out.println("с четное");
            } else
                System.out.println("с не четное");

            System.out.println("4:");
            if (с == 0) {
                System.out.println("с" + " равно 0");
            } else {
                System.out.println("с" + " не равно 0");
            }

            System.out.println("5:");
            System.out.println("с % 2 == 0  is " + (с % 2 == 0));
            System.out.println();

        /*
        a < b
        a > b
        a >= b
        a <= b
        a == b
        a != b
         */
            System.out.println("6: логическое -И- &&");
            System.out.println("true && false = " + (true && false));
            System.out.println("true && true = " + (true && true));
            System.out.println("false && true = " + (false && true));
            System.out.println("false && false = " + (false && false));
            System.out.println();

            System.out.println("a - не четное И не равно 0 " + ((a % 2 != 0) && (a != 0)));

            System.out.println();

            System.out.println("8: логическое - ИЛИ - ||");
            System.out.println("true || false = " + (true || false));
            System.out.println("true || true = " + (true || true));
            System.out.println("false || true = " + (false || true));
            System.out.println("false || false = " + (false || false));
            System.out.println();

            // java boolean operators
            //   s + d * f                     x == y || y == 1 && x > 2
            // последовательность выполнения:    4     5    1    3   2
            // если 1 истина --> 2
            // если 1 ложь --> 3 --> 4
            //   (s + d) * f                   (x == y || y == 1) && x > 2
            // последовательность выполнения:      1    3    2    5    4
            // если 1 истина --> 3 --> 4 --> 5
            // если 1 ложь --> 2


            System.out.println();
            System.out.println("9: логическое -НЕ- !");
            System.out.println("!false = " + (!false));
            System.out.println("!true = " + (!true));
            System.out.println( );
            System.out.println("ложь это правда" );
            System.out.println("!(1 > 2) - " + !(1 > 2));

            System.out.println("правда это ложь" );
            System.out.println("!(1 < 2) - " + !(1 < 2));


        }
    }

