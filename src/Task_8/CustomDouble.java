package Task_8;

import java.util.Objects;

public class CustomDouble {
    public int a;
    public double b;

    public CustomDouble (final int a, final double b) {
        this.a = a;
        if(b >= 0.0 && b < 1)
            this.b = b;
        else
            this.b = b % 1;
    }

    public int getA() {
        return a;
    }

    public void setA(final int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(final double b) {
        if(b >= 0.0 && b < 1)
            this.b = b;
        else
            this.b = b % 1;
    }

    public CustomDouble sum(final CustomDouble s){
        final CustomDouble k;
        final CustomDouble r = new CustomDouble(0, 0);
        r.a = a + s.getA();
        r.b = b + s.getB();
        if(b > 1){

        }
        return r;
    }

    public CustomDouble subtraction(final CustomDouble sub){

        return new CustomDouble(a - sub.a, b - sub.b);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomDouble that)) return false;
        return getA() == that.getA() && Double.compare(that.getB(), getB()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }

    @Override
    public String toString() {
        return " CustomDouble = { " +
                " a = " + a +
                ", b = " + b +
                '}';
    }
    public double toDouble() {
        return (double) a + b;
    }
}