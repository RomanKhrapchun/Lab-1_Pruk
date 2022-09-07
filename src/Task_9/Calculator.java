package Task_9;

import Task_8.CustomDouble;

public class Calculator {

    public CustomDouble suma(final CustomDouble a, final CustomDouble b){
        return a.sum(b);
    }

    public CustomDouble minus(final CustomDouble a, final CustomDouble b){
        return a.subtraction(b);
    }

    public static int multiply(final int a, final int b) {
        return a * b;
    }
    public double multiply(final CustomDouble a, final CustomDouble b){
        return a.toDouble() * b.toDouble();
    }

    public static int divide(final int a, final int b) {
        return a / b;
    }
    public double divide(final CustomDouble a, final CustomDouble b){
        return a.toDouble() / b.toDouble();
    }
}
