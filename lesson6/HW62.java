package lesson6;

public class HW62 {
    public static void main(String[] args) {
//Задача №1
        //
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)
      System.out.println("Задача №1");
        String s = "Перестановочный алгоритм быстрого действия";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print('o');
            }
        }
        System.out.println("\n\nЗадача №2");
// Задача №2
        //
        //Дана строка:
        //String s1 = “Перевыборы выбранного президента”;
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4.
        String s1 = "Перевыборы выбранного президента";
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
               a += 1;
            }
        }
        System.out.print("а буковок < е > в тексте - " + a);


        System.out.println("\n\nЗадача №3");
// Задача №3
        //
        //Дана строка:
        //String s3 = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.

        String s3 = "Посмотрите как Рите нравится ритм";
        String str3 = s3.toLowerCase();

        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i) == 'р' && str3.charAt(i + 1) == 'и' && str3.charAt(i + 2) == 'т') {
                System.out.print(i + " ");
            }
        }
        System.out.println(" - так решил я\n,а так на разборе ДЗ:");
        int index = str3.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = str3.indexOf("рит", index+1);
        }




        System.out.println("\n\nЗадача №4");
//Экстра задача
        //
        //Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {{"Привет", "всем","кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int q = 0;
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].indexOf('е') == -1) {
                    q ++;
                }
                if (array[i][j].contains("е")) {
                    z ++;
                }
            }
        }
        System.out.println("количество строк в массиве, которые не содержат буквы “е” - " + q);
        System.out.println("количество строк в массиве, которые  содержат буквы “е” - " + z);

    }
}
