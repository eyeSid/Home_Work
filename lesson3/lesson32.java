package lesson3;

public class lesson32 {
    public static void main(String[] args) {

        System.out.print(1);
        System.out.print(2);
        System.out.print(3);
        System.out.print(4);
        System.out.println(5);


        for(int i = 6; i <= 8; i = i + 1) {
            System.out.println(i);

            System.out.println( );
        }

        int g = 20;
        int j = 0;
        System.out.println("g=" + g);
        for( g = 5; g >= 3; g = g - 1) {
            System.out.print(g);
            j=g;
        }
        System.out.println( );
        System.out.println("g=" + g);
        System.out.println("g остановилось на - " + j);

        System.out.println( );




    }
}
