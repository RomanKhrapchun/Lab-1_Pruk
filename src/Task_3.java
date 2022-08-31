public class Task_3 {
    public static void main(final String[] args){
        System.out.println(factorialRecur(7));// опис
        System.out.println(factorialLoop(7));
    }
    public static int factorialRecur(final int n){
        if(n <= 1)
            return 1;
        else
            return n * factorialRecur(n-1);
    }
    public static int factorialLoop(final int n) {
        int fact = 1;
        int i = 1;
        while(i <= n)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
