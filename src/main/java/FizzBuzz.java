public class FizzBuzz {
    static String fizzBuzz(int number) {
        String result = "";
        if(String.valueOf(number).contains("5")){
        }else{
            if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                result += "Fizz";
            }
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }

        if(result.equals("")){
            result = String.valueOf(number);
        }
        return result;
    }
}
