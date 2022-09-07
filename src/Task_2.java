public class Task_2
{
    public static void main(final String[] args) {
        final char letter = 'j';
        final String arg = "fjaksdfkjdslafskdjffkls";
        System.out.println("string before deleting : \"" + arg +"\"");
        output(arg);
        System.out.println("string after deleting : \"" + deleting(arg, letter) + "\"");
    }

    public static void output(final String arg){
        System.out.println(arg);
    }

    public static String deleting(final String arg, final char letter){

        return arg.replace(Character.toString(letter), "");
    }
}