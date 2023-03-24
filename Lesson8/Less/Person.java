package Lesson8.Less;

public class Person {
    private String name;
    private int age;
    private String lastname;


    public Person(String lastname, String name, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
