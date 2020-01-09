public class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = "";

        boolean canFizz = true;
        boolean canBuzz = true;
        boolean canWhizz = true;
        boolean canContain3 = true;
        boolean canContain5 = true;

        if (contains7(number)) {
            canBuzz = false;
            canContain5 = false;
        }

        if (canContain5 && contains5(number)) {
            canContain3 = false;
            canFizz = false;
        }

        if (canContain3 && contains3(number)) {
            canFizz = false;
            canBuzz = false;
            canWhizz = false;
        }

        if ((canFizz && isFizz(number)) || (canContain3 && contains3(number))) {
            result += "Fizz";
        }

        if (canBuzz && isBuzz(number)) {
            result += "Buzz";
        }

        if (canWhizz && isWhizz(number)) {
            result += "Whizz";
        }

        if (result.equals("")) {
            return String.valueOf(number);
        }

        return result;
    }

    private static boolean contains3(int number) {
        return String.valueOf(number).contains("3");
    }

    private static boolean contains5(int number) {
        return String.valueOf(number).contains("5");
    }

    private static boolean contains7(int number) {
        return String.valueOf(number).contains("7");
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
