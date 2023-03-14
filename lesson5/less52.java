package lesson5;

public class less52 {
    public static void main(String[] args) {
        int b = 1000;
        int [] a = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = i;
        }
        int sum = 0;
        for (int j = 0; j < b; j++) {
            sum += a[j];
        }
        System.out.println("сумма чисел до " + ( b - 1 ) +" = " + sum);
    }
}
