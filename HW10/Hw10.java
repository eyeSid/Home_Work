package HW10;

import java.util.Arrays;
import java.util.Locale;

public class Hw10 {
    public static String abbrevName(String name) {
      //  name = name.toUpperCase();
        String[] c = name.toUpperCase().split(" ");
        char n = c[0].charAt(0);
        char f = c[1].charAt(0);
        return name = (n + "." + f);

    }
    public static boolean feast(String beast, String dish) {
        boolean allowed = false;
        char b = beast.charAt(0);
        char d = dish.charAt(0);
        char bb = beast.charAt(beast.length() - 1);
        char dd = dish.charAt(dish.length() - 1);

      if (b == d && bb == dd){
          allowed = true;
        } else {
          allowed = false;
      }
        return allowed;
    }

    public static void main(String[] args) {
        String name = "bobi Zjonson";
        System.out.println(abbrevName(name));


        String beast = "qiiir";
        String dish = "qeeeer fg";
        System.out.println(dish.charAt(dish.length() - 1));

    }
    public static String tripleTrouble(String one, String two, String three) {
        String trouble = null;
        String[] triple = {one, two, three};

        for (int i = 0; i < triple.length; i++) {
        char firstTriple = triple[0].charAt(i);
        char secondTriple = triple[1].charAt(i);
        char  thirdTriple = triple[2].charAt(i);
        trouble = trouble + firstTriple + secondTriple + thirdTriple;
        }
        return trouble;

        //expected:<[ttlheoiscstk]> but was:<[nullttlheoisc]>
    }



}
