import java.util.*;

public class Task_1
{
    public static void main(final String[] args) {
        final String arg = "[lory adam aaaa aaa]";
        System.out.println("String before replacing = \"" + arg +"\"");

        final String out = sortByA(arg);
        System.out.println("String after replacing = \"" + out +"\"");
    }

    public static String sortByA(final String arg){

        final String[] result = arg.split(" ");

        final Comparator<String> comp = Comparator.comparing(word -> countALetter(word));
        Arrays.sort(result, comp.reversed());

        return Arrays.toString(result);
    }

    private static int countALetter(final String word)
    {
        final char someChar = 'a';
        int count = 0;

        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == someChar)
            {
                count++;
            }
        }
        return count;
    }
}

