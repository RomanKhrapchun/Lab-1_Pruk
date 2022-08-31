package Task_10;
import java.util.List;

public class Task_10 {
    public static void main(final String[] args) {
        final House hou = new House(List.of(
                new BedRoom("blue", 2, 2, 2, 3, 1, 1),
                new LivingRoom("sky-blue", 1, 2, 3, 2, 1, 2),
                new Kitchen("white", 0, 0, 5, 1, 1)),
                "blue", 3, 4);

        System.out.println(hou);
    }
}
