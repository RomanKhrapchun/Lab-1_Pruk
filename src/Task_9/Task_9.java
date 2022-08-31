package Task_9;

import Task_8.CustomDouble;

public class Task_9 {
    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(2, 0.8);
        final CustomDouble b = new CustomDouble(1, 0.3);

        final Calculator calc = new Calculator();

        final CustomDouble sum = calc.suma(a, b);
        System.out.println(sum.getA() + "  " + sum.getB());

        final CustomDouble minus = calc.minus(a, b);
        System.out.println(minus.getA() + "  " + minus.getB());

        System.out.println(calc.multiply(a, b));

        System.out.println(calc.divide(a, b));
    }
}
