package lesson6;

public class less62 {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3};
        // find the max value
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result > arr[i]);
            result = arr[i];
        }
        System.out.println(result);


        int[][] arr1 = {{1, 2 , 3},{1, 2 , 3}};
        // find the max value
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            count += arr1[i].length;
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
//                count ++;
            }
        }
        System.out.println(sum * 1.0 / count);








    }
}
