package lesson6;

import java.util.Arrays;

public class less62 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = arr;
        arr2[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("\n");



        String str = "HELlo BRO";
        String str2 = str;
        str2 = "Hi";
        System.out.println(str);
        System.out.println("заглавные " + str2);

        String str3 = str.toLowerCase();  // функция (метод) который переводит ЗАГЛАВНЫЕ в строчные

        System.out.println(str3); // - распечатали str3 которому присвоенны данные str переведенная в строчные буквы
        System.out.println(str);

        str2 = str2.toLowerCase();  // - перевели строку в строчные буквы и переприсвоили str2
        System.out.println("строчные " + str2);

        str = str.replace('B', 'D'); // - поиск и замена буквы ( ' в апоостраф ' )
        System.out.println(str);
        str = str.replace("DRO", "Girl");  // - поиск и замена слова ( " в кавычках " )
        System.out.println(str);
        System.out.println(str.indexOf("i"));








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
        System.out.println("\n");
        System.out.println(Arrays.toString(I));
        System.out.println(Arrays.toString(i));
//-----------------------------------------------------------------------------














    }
}
