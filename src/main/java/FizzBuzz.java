public class FizzBuzz {
    static String fizzBuzz(int number){
        if(number % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
