public class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = "";

        boolean canFizz = true;
        boolean canBuzz = true;
        boolean canWhizz = true;
        boolean canContain3 = true;
        boolean canContain5 = true;

        if (contains(number, "7")) {
            canBuzz = false;
            canContain5 = false;
        }

        if (canContain5 && contains(number,"5")) {
            canContain3 = false;
            canFizz = false;
        }

        if (canContain3 && contains(number,"3")) {
            canFizz = false;
            canBuzz = false;
            canWhizz = false;
        }

        if ((canFizz && canMultipliedBy(number,3)) || (canContain3 && contains(number,"3"))) {
            result += "Fizz";
        }

        if (canBuzz && canMultipliedBy(number,5)) {
            result += "Buzz";
        }

        if (canWhizz && canMultipliedBy(number, 7)) {
            result += "Whizz";
        }

        if (result.equals("")) {
            return String.valueOf(number);
        }

        return result;
    }

    private static boolean contains(int number, String matchString) {
        return String.valueOf(number).contains(matchString);
    }

    private static boolean canMultipliedBy(int number, int dividend) {
        return number % dividend == 0;
    }
}
