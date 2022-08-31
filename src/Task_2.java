public class Task_2
{
    public static void main(final String[] args)
    {
        final String arg = "fjaksdfkjdslafskdjffkls";
        System.out.println("string before deleting : \"" + arg +"\"");
        output(arg);
        System.out.println("string after deleting : ");
        final String out = deleting(arg);
        output(out);
    }

    public static void output(final String arg){
        System.out.println(arg);
    }

    public static String deleting(final String arg){
        return arg.replace("j", "");
    }
}