public class Factorial {
    public static int factorial(int number) {
        if(number < 0 || number > 12){
            throw new IllegalArgumentException();
        }
        if(number == 0){
            return 1;
        }
        return number * factorial(number -1);
    }
}
