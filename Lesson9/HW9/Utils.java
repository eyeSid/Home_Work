package Lesson9.HW9;


public class Utils {
    //поиск сотрудника в массиве по его имени
    public static int FindByName(String name,Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static int FindBySubName(String subname, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subname)) {
                return i;
            }
        }
        return -1;
    }
    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int sumSalary(Worker[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalary();
        }
        return result;
    }
    public static int sumSalary(Manager[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalary();
        }
        return result;
    }
    public static int sumSalary(Director[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalary();
        }
        return result;
    }
    //поиск наибольшей зарплаты в массиве
    public static int findMaxSalary(Worker[] arr) {
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxSalary < arr[i].getSalary()) {
                maxSalary = arr[i].getSalary();
            }
        }
        return maxSalary;
    }
    //поиск наименьшей зарплаты в массиве
    public static int findMaxSalary(Manager[] arr) {
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minSalary > arr[i].getSalary()) {
                minSalary = arr[i].getSalary();
            }
        }
        return minSalary;
    }


    }

