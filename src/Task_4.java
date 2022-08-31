public class Task_4 {
    public static void main(final String[] args) {

        final int max = 100;

        for (int i = 1; i <= max; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
