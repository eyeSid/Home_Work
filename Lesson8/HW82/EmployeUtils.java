package Lesson8.HW82;
//Необходимо создать класс со следующими методами:
//поиск сотрудника в массиве по его имени
//поиск сотрудника в массиве по вхождению указанной строки в его имени
//подсчет зарплатного бюджета для всех сотрудников в массиве
//поиск наименьшей зарплаты в массиве
//поиск наибольшей зарплаты в массиве
//поиск наименьшего количества подчиненных в массиве менеджеров
//поиск наибольшего количества подчиненных в массиве менеджеров
//поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

public class EmployeUtils {
//поиск сотрудника в массиве по его имени
    public int FindByName(String name, Employee[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (name.equals(arr[i].getName())) {
                return i;
                }
                }
            return -1;
            }
//поиск сотрудника в массиве по вхождению указанной строки в его имени
    public int FindBySubName(String subname, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subname)) {
                return i;
            }
        }
        return -1;
    }
//подсчет зарплатного бюджета для всех сотрудников в массиве
    public int sumSalary(Worker[] arr) {
            int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalaryWorker();
            }
        return result;
    }
    public int sumSalary(Manager[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalaryManager();
        }
        return result;
    }
    public int sumSalary(Director[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i].getSalaryDirector();
        }
        return result;
    }
//поиск наибольшей зарплаты в массиве
public int findMaxSalary(Worker[] arr) {
    int maxSalary = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (maxSalary < arr[i].getSalaryWorker()) {
            maxSalary = arr[i].getSalaryWorker();
        }
    }
    return maxSalary;
}
//поиск наименьшей зарплаты в массиве
    public int findMaxSalary(Manager[] arr) {
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minSalary > arr[i].getSalaryManager()) {
                minSalary = arr[i].getSalaryManager();
            }
        }
        return minSalary;
    }
//поиск наименьшего количества подчиненных в массиве менеджеров






}

