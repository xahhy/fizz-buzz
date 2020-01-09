public class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = "";
        boolean ignoreFizz = false;
        boolean ignoreContain5 = false;

        if(String.valueOf(number).contains("7")){
            ignoreContain5 = true;
        }

        if (!ignoreContain5 && String.valueOf(number).contains("5")) {
            ignoreFizz = true;
        }
        if (!ignoreFizz && (isFizz(number) || String.valueOf(number).contains("3"))) {
            result += "Fizz";
        } else {
            if (isBuzz(number) || String.valueOf(number).contains("5")) {
                result += "Buzz";
            }
            if (isWhizz(number) || String.valueOf(number).contains("7")) {
                result += "Whizz";
            }
        }
        if (result.equals("")) {
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
