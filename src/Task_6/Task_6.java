package Task_6;

public class Task_6 {
    public static void main (final String[] args) {
        final User first_user = new User("Oleksandr", "Gamayunov", 19, "gamayunov@gmail.com");
        final User second_user = new User("Roman", "Khrapchun", 18, "khrapchun@gmail.com");

        System.out.println("hashcode for first user = " + first_user.hashCode());
        System.out.println("hashcode for second user = " + second_user.hashCode());

        final String equalitySign = first_user == second_user ? " == " : " != ";

        System.out.println(first_user + equalitySign + second_user);
        System.out.println(first_user.equals(second_user));
    }
}