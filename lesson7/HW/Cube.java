package lesson7.HW;

public class Cube {
    private int Side;

    public int getSide() {
        return Side;
    }
    public void setSide(int num) {
        this.Side = num;
    }
    public static void main (String[] args) {
        Cube cube = new Cube();
        cube.setSide(10);
        System.out.print(cube.getSide());
    }
}
