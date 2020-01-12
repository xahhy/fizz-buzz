public class FizzBuzz {
    static String fizzBuzz(int number){
        String result = "";
        String numberString = String.valueOf(number);
        if(numberString.contains("7")){
            if(numberString.contains("3")){
                return "Fizz";
            }
            if(number % 3 == 0){
                result += "Fizz";
            }
            if(number % 7 == 0){
                result += "Whizz";
            }
            return result.isEmpty() ? String.valueOf(number) : result;
        }
        if(numberString.contains("5")){
            if(number % 5 == 0){
                result += "Buzz";
            }
            if(number % 7 == 0){
                result += "Whizz";
            }
            return result.isEmpty() ? String.valueOf(number) : result;
        }
        if(numberString.contains("3")){
            return "Fizz";
        }
        if(number % 3 == 0){
            result += "Fizz";
        }
        if(number % 5 == 0){
            result += "Buzz";
        }
        if(number % 7 == 0){
            result += "Whizz";
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }

}
