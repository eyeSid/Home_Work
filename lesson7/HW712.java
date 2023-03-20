package lesson7;

public class HW712 {
    public static void main(String[] args) {
        HW712_Employee hw712_employee = new HW712_Employee("Fedya");
        HW712_isSameName hw712IsSameName = new HW712_isSameName("Galya");

        System.out.println(hw712_employee.isSameName("Galya"));
        System.out.println(hw712_employee.isSameName("Fedya"));

    }
}
