package lesson2;

public class HW22 {
    public static void main(String[] args) {
        int a = 100;
        int b = 15;
        int f = a / b;
        int g = a % b;

        // System.out.println(f);
        System.out.println(g);

        if (a % 2 == 1) {
            System.out.println(a + " - не четное");
        } else {
            System.out.println(a + " - четное");
        }
            if (b % 2 == 0) {
                System.out.println(b + " -  четное");
            } else {
                System.out.println(b + " - не четное");
        }
    }
}
