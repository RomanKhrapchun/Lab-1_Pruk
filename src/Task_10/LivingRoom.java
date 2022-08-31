package Task_10;

import java.util.Objects;

public class LivingRoom extends Room {
    final int sofa;
    final int tv;

    public LivingRoom(final String color, final int doors, final int windows, final int chair, final int table, final int sofa, final int tv) {
        super(color, doors, windows, chair, table);
        this.sofa = sofa;
        this.tv = tv;
    }

    public int getSofa() {
        return sofa;
    }

    public int getTv() {
        return tv;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof LivingRoom that)) return false;
        if (!super.equals(o)) return false;
        return getSofa() == that.getSofa() && getTv() == that.getTv();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSofa(), getTv());
    }

    @Override
    public String toString() {
        return "LivingRoom = {" +
                "sofa = " + sofa +
                ", tv = " + tv +
                ", color = '" + color + '\'' +
                ", doors = " + doors +
                ", windows = " + windows +
                ", chair = " + chair +
                ", table = " + table +
                '}';
    }
}
