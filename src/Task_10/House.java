package Task_10;

import java.util.Objects;
import java.util.List;

public class House {

    private List<Room> room;
    final String roomColor;
    final int doorNumber;
    final int windowNumber;

    public House(final List<Room> room, final String roomColor, final int doorNumber, final int windowNumber) {
        this.room = room;
        this.roomColor = roomColor;
        this.doorNumber = doorNumber;
        this.windowNumber = windowNumber;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public int getWindowNumber() {
        return windowNumber;
    }

    public List<Room> getRoom(){
        return room;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;
        return doorNumber == house.doorNumber && windowNumber == house.windowNumber && Objects.equals(roomColor, house.roomColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomColor, doorNumber, windowNumber);
    }

    @Override
    public String toString() {
        return "House = { " +
                "room = " + room +
                ", roomColor = '" + roomColor + '\'' +
                ", doorNumber = " + doorNumber +
                ", windowNumber = " + windowNumber +
                '}';
    }
}
