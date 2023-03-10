package lesson4;

public class HW42 {

    public static void main(String[] args) {
/*  
        System.out.println("положительные степени числа 5:");
        for ( long a = 1 ; Math.pow(5, a) < 10000 ; a = a + 1) {
            System.out.println("5 в степени " + a + " = " + Math.pow(5, a));
        }
*/      
        for (int i = 1; i < 10000; i = i * 5) {
            System.out.println(i);
        }
    }
}
