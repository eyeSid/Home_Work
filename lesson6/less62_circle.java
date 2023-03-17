package lesson6;

public class less62_circle {
    public static void main(String[] args) {
/*      MM and ..
        считаем построчно
        d = 2r
        функция окружности по координатам (x-a)^2 + (y-b)^2 = r^2
        a - удаление центра окружности от начала координат по x
        b - удаление центра окружности от начала координат по y
        r - радиус
*/
        int r = 15; // - radius
        int indent = 5; // - отступ ( a которое равно b )
        int size = r + indent;
        int rSq = r * r;

        for (int y = size; y >= -size; y--) {
            for (int x = -size; x <= size; x++) {
                if ((x * x + y * y) <= rSq){
                    System.out.print("MMM");
                } else {
                    System.out.print("...");
                }
            }
            System.out.println();

        }
        


    }
}
