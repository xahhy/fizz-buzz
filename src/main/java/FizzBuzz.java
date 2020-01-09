public class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = "";
        if (isFizz(number)) {
            result += "Fizz";
        }
        if (isBuzz(number)) {
            result += "Buzz";
        }
        if (isWhizz(number)) {
            result += "Whizz";
        }
        if(result.equals("")){
            return String.valueOf(number);
        }
        return result;
    }

    private static boolean isWhizz(int number) {
        return number % 7 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
