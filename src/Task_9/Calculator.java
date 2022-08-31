package Task_9;

import Task_8.CustomDouble;

public class Calculator {

    public CustomDouble suma(final CustomDouble a, final CustomDouble b){
        return a.sum(b);
    }

    public CustomDouble minus(final CustomDouble a, final CustomDouble b){
        return a.subtraction(b);
    }

    public double multiply(final CustomDouble a, final CustomDouble b){
        final CustomDouble r = new CustomDouble(0, 0);
        r.a = a.getA() * b.getA();
        r.b = a.getB() * b.getB() + a.getA() * b.getB() + a.getB() * b.getA();
        while(r.getB() >= 1){
            r.b = r.b - 1;
            r.a = r.a + 1;
        }
        final double result = r.toDouble();
        return result;
    }

    public double divide(final CustomDouble a, final CustomDouble b){
        return a.toDouble() / b.toDouble();
    }
}
