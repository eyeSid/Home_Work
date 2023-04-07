package HW10;

import java.util.Arrays;

public class Hw10 {
    public static String abbrevName(String name) {
       // name = "dfg fgh";
        return name;// = (n + ". " + f);

    }
    
    public static void main(String[] args) {
        String name = "bob djonson";

        String[] c = abbrevName(name.toUpperCase()).split(" ");
        char n = c[0].charAt(0);
        char f = c[1].charAt(0);
        name = (n + ". " + f);

        System.out.println(abbrevName(name));

    }

}
