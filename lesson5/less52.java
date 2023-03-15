package lesson5;

public class less52 {
    public static void main(String[] args) {

  /*      int b = 1000;
        int [] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = i;
        }
        int sum = 0;
        for (int j = 0; j < b; j++) {
            sum += a[j];
        }
        System.out.println("сумма чисел до " + ( b - 1 ) +" = " + sum);
        System.out.println("в массиве " + a.length + " значений, 999 из него = " + a[999]);

        System.out.println();
        System.out.println( "задачи с char");

        char [] string = "КУ КУ МОЙ МАЛЬЧИК".toCharArray();
        char [] string2 = new char[] {'H', 'E', 'L', 'L', 'O'};
        char [] string3 = new char[3];
        string3[0] = 'h';
        string3[1] = 'e';
        string3[2] = 'y';
        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i]);
        }
        System.out.println();
        for (int j = 0; j < string2.length; j++) {
            System.out.println(string2[j]);
        }
        System.out.println();
        for (int k = 0; k < string3.length; k++) {
            System.out.print(string3[k]);
        }
*/
        System.out.println();
        System.out.println("тема двойной массив");

        int[][] c = new int[3][10];
        System.out.println("длинна двойного массива с == " + c.length);

        for (int l = 0; l < c.length; l++) {
            int[] d = c[l];
            for (int m = 0; m < d.length; m++) {
                System.out.println(d[m]);
  //              System.out.println(c[l][m]);
            }
        }

        char[][] f = new char[3][];
        f[0] = "понимаешь".toCharArray();
        f[1] = "он".toCharArray();
        f[2] = "ушел".toCharArray();

        System.out.println("длинна двойного массива char f == " + f.length);

        for (int n = 0; n < f.length; n++) {
            char[] g = f[n];
            for (int p = 0; p < g.length; p++) {
                System.out.print(g[p]);
                //            System.out.println(f[n][p]);
            }
            System.out.println();
        }
        System.out.println("\nУпрощаем предыдущий код\n");
        for (int q = 0; q < f.length; q++) {
            for (int r = 0; r < f[q].length; r++) {
                System.out.print(f[q][r]);

            }
            System.out.println();
        }



    }
}
