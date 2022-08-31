package Task_8;

public class Task_8 {
    public static void main(final String[] args) {
        final CustomDouble a = new CustomDouble(2, 0.8);
        final CustomDouble b = new CustomDouble(1, 0.3);

        final CustomDouble c = a.sum(b);
        final CustomDouble d = a.subtraction(b);
        System.out.println(" -----------");
        System.out.println(" | " + c.getA() + " | " + c.getB() + " | ");
        System.out.println(" | " + d.getA() + " | " + d.getB() + " | ");
        System.out.println(" -----------");

        System.out.println("Hashcode for first Task_8.CustomDouble = " + a.hashCode());
        System.out.println("hashcode for second Task_8.CustomDouble = " + b.hashCode());

        final String equalitySign = a == b ? " == " : " != ";

        System.out.println(a + equalitySign + b);
        System.out.println(a.equals(b));

        System.out.println(c.toDouble());
    }
}
