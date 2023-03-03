package lesson3;

public class HW42 {

    public static void main(String[] args) {
        System.out.println("положительные степени числа 5:");
        for ( long a = 1 ; a < 10000 ; a = a + 1) {
            System.out.println("5 в степени " + a + " = " + Math.pow(5, a));
        }
    }
}
