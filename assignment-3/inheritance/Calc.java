public class Calc {
    public static void main(String[] args) {
        Calculate calc = new Calculate(10, 20);
        calc.addition();
        calc.subtraction();
        calc.multiplication();
        double div = calc.division();
        System.out.println(div);
        System.out.println(calc);
    }
}
