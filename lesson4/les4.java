package lesson4;
 // для изменения группового переменной в контексте курсор перед переменной + "shift +F6"
public class les4 {
    public static void main(String[] args) {

        for (int k = 0; k < 5; k = k + 1)
            System.out.println( "k = " + k);

        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i = i + 1;
        }

        int f = 0;
        do {
            f = f + 1;
            System.out.println("f = "+ f);
        } while (f < 5);
    }
}
