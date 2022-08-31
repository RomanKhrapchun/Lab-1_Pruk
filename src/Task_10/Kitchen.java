package Task_10;

import java.util.Objects;

public class Kitchen extends Room {
    final int kitchenTable;

    public Kitchen(final String color, final int doors, final int windows, final int chair, final int table, final int kitchenTable) {
        super(color, doors, windows, chair, table);
        this.kitchenTable = kitchenTable;
    }

    public int getKitchenTable() {
        return kitchenTable;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Kitchen kitchen)) return false;
        if (!super.equals(o)) return false;
        return getKitchenTable() == kitchen.getKitchenTable();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getKitchenTable());
    }

    @Override
    public String toString() {
        return "Kitchen = { " +
                "kitchenTable = " + kitchenTable +
                ", color = '" + color + '\'' +
                ", doors = " + doors +
                ", windows = " + windows +
                ", chair = " + chair +
                ", table = " + table +
                '}';
    }
}
