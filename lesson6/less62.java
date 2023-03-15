package lesson6;

import java.util.Arrays;

public class less62 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = arr;
        arr2[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


        String str = "Hello";
        String str2 = str;
        str2 = "Hi";
        System.out.println(str);
        System.out.println(str2);
//-------------------------------------------------------------------------
        // ПЕРЕМЕННЫЕ
        //reference type пишутся с Большой буквы
        //value type пишутся с маленькой буквы

        Integer A = 10;
        int b = 1;

        Long L = 100L;
        long l = 10;

        Double D = 100.0;
        double d =10;
//----------------------------------------------------------------------------
        Integer[] I = new Integer[5];
        int [] i = new int[5];

        System.out.println(Arrays.toString(I));
        System.out.println(Arrays.toString(i));














    }
}
