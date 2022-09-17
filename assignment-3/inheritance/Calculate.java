public class Calculate implements Calculator {
    int x;
    int y;

    Calculate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addition() {
        int add = x + y;
        System.out.println(add);

    }

    public void subtraction() {
        int sub = x - y;
        System.out.println(sub);
    }

    public void multiplication() {

        int mul = x * y;
        System.out.println(mul);
    }

    public double division() {

        double div = x % y;
        return div;
    }

    public String toString() {
        return "Calculate [x=" + x + ", y=" + y + "]";
    }
}
