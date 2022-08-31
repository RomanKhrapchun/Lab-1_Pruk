package Task_10;

import java.util.Objects;

public class BedRoom extends Room{
    final int bed;
    final int pc;

    public BedRoom(final String color, final int doors, final int windows, final int chair, final int table, final int bed, final int pc) {
        super(color, doors, windows, chair, table);
        this.bed = bed;
        this.pc = pc;
    }

    public int getBed() {
        return bed;
    }

    public int getPc() {
        return pc;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof BedRoom bedRoom)) return false;
        if (!super.equals(o)) return false;
        return getBed() == bedRoom.getBed() && getPc() == bedRoom.getPc();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBed(), getPc());
    }

    @Override
    public String toString() {
        return "BedRoom = {" +
                "bed = " + bed +
                ", pc = " + pc +
                ", color = '" + color + '\'' +
                ", doors = " + doors +
                ", windows = " + windows +
                ", chair = " + chair +
                ", table = " + table +
                '}';
    }
}
