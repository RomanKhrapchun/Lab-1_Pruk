package Task_8;

import java.util.Objects;

public class CustomDouble {
    public int a;
    public double b;

    public CustomDouble(final double result) {
        this.a = (int) result;
        this.b = result - b;
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
        if(b < 1)
            this.b = b;
        else
            this.b = b % 1;
    }

    public CustomDouble sum(final CustomDouble number2){
        final double result = this.toDouble() + number2.toDouble();
        return new CustomDouble(result);
    }

    public CustomDouble subtraction(final CustomDouble number2){
        final double result = this.toDouble() - number2.toDouble();
        return new CustomDouble(result);
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