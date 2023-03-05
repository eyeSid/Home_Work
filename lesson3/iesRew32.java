package lesson3;
 // правка созданна дома
public class iesRew32 {
    public static void main(String[] args) {
        String str ="qwerty";
        int limit = 20;

        for (; str.length() < limit; ) {
            str = str + "-";
        }
        System.out.println(str);

        String stro ="ytrewq";
        int limito = 20;


        for (; stro.length() < limito; stro = "-" + stro) {

        }
        System.out.println(stro);

    }
}
