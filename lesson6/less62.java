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
  //--------------------------------------------------------------------
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
        System.out.println("\n");
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
        System.out.println("\n");
//-----------------------------------------------------------------------------
        // сравнение типов referens type
        int[] yrr = {1, 2, 3};
        int[] yrr2 = yrr;
        int[] yrr3 = {1, 2, 3};
        System.out.println(yrr == yrr2);  // true - потому что один и тот же объект в переменных
        System.out.println(yrr == yrr3);  // false - потому что объекты разные
        System.out.println(Arrays.equals(arr, arr2));  // true - функция сравнения объектов в массиве
        System.out.println("\n");
//-----------------------------------------------------------------------------
        System.out.println("сравнение Integer");

        Integer a1 = 10;
        Integer b1 = 10;
        Integer c1 = 5 + 5;
        System.out.println(a1 == b1);
        System.out.println(a1 == c1);
        System.out.println("\n");

        Integer a2 = 100;
        Integer b2 = 100;
        Integer c2 = 50 + 50;
        System.out.println(a2 == b2);
        System.out.println(a2 == c2);
        System.out.println("\n");

        Integer a3 = 1000;
        Integer b3 = 1000;
        Integer c3 = 500 + 500;

        System.out.println(a3 == b3);
        System.out.println(a3 == c3);
        System.out.println(a3.equals(b3));  // оператор сравнения значения

        //      Объекты нельзя сравнивать через двойное равно, если не хочешь понять,
        //      что это один и тот же объект
        //      java хранит все значения от -128 ... 127 в своей памяти и если присваемое
        //      переменной значение входит в этот диапазон, java подставляет адрес хранения
        //      этого значения ( a1, b1 , c1, a2, b2, c2)
//-----------------------------------------------------------------------------
        System.out.println("\nсравнение строк String");
        String s1 = "Hi bro";
        String s2 = new String("Hi ") + new String("bro");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//-----------------------------------------------------------------------------
        System.out.println("\nдикремент");
        int[] decr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("печать значений массива с конца: - ");
        for (int k = decr.length - 1; k >= 0; k--) {
            System.out.print (decr[k] + " ");
            }
        System.out.println("\nдекремент (--i) делает то же");
        for (int j = decr.length; --j >= 0; ) {
            System.out.print (decr[j] + " \n");
            }
        System.out.println("\nThe End\n");
    }
}
