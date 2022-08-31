package Task_10;

import java.util.List;
import java.util.Objects;

public class Room {
    final String color;
    final int doors;
    final int windows;
    final int chair;
    final int table;

    public Room(final String color, final int doors, final int windows, final int chair, final int table) {
        this.color = color;
        this.doors = doors;
        this.windows = windows;
        this.chair = chair;
        this.table = table;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getChair() {
        return chair;
    }

    public int getTable() {
        return table;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return getDoors() == room.getDoors() && getWindows() == room.getWindows() && getChair() == room.getChair() && getTable() == room.getTable() && Objects.equals(getColor(), room.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getDoors(), getWindows(), getChair(), getTable());
    }

    @Override
    public String toString() {
        return "Room = { " +
                "color = '" + color + '\'' +
                ", doors = " + doors +
                ", windows = " + windows +
                ", chair = " + chair +
                ", table = " + table +
                '}';
    }
}
