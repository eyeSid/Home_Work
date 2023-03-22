package lesson7.hw;

public class HW711_getName {
    String name;
    int age;
    String gender;
    String getName () {
        if (gender == "woman") {
            if (age > 30){
                return "Mrs. " + name;
            } else {
                return "Ms. " + name;
            }
        } else {
            return "Mr. " + name;
        }
    }
}
