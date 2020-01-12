import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {
    interface Rule {
        String apply(int number);

        boolean isMatch(int number);
    }

    static class FizzRule implements Rule {
        @Override
        public String apply(int number) {
            return "Fizz";
        }

        @Override
        public boolean isMatch(int number) {
            return number % 3 == 0;
        }
    }

    static class BuzzRule implements Rule {
        @Override
        public String apply(int number) {
            return "Buzz";
        }

        @Override
        public boolean isMatch(int number) {
            return number % 5 == 0;
        }
    }

    static class WhizzRule implements Rule {
        @Override
        public String apply(int number) {
            return "Whizz";
        }

        @Override
        public boolean isMatch(int number) {
            return number % 7 == 0;
        }
    }

    static class Contains3Rule implements Rule {
        @Override
        public String apply(int number) {
            return "Fizz";
        }

        @Override
        public boolean isMatch(int number) {
            return String.valueOf(number).contains("3");
        }
    }

    static class Contains5Rule implements Rule {
        @Override
        public String apply(int number) {
            return RulesAssembler.apply(Arrays.asList(new BuzzRule(), new WhizzRule()))
                    .apply(number);
        }

        @Override
        public boolean isMatch(int number) {
            return String.valueOf(number).contains("5");
        }
    }

    static class Contains7Rule implements Rule {
        @Override
        public String apply(int number) {
            return RulesAssembler.apply(Arrays.asList(new Contains3Rule(), new FizzRule(), new WhizzRule()))
                    .apply(number);
        }

        @Override
        public boolean isMatch(int number) {
            return String.valueOf(number).contains("7");
        }
    }


    static class DefaultRule implements Rule {
        @Override
        public String apply(int number) {
            return RulesAssembler.apply(Arrays.asList(new FizzRule(), new BuzzRule(), new WhizzRule()))
                    .apply(number);
        }

        @Override
        public boolean isMatch(int number) {
            return Stream.of(new FizzRule(), new BuzzRule(), new WhizzRule())
                    .anyMatch(rule -> rule.isMatch(number));
        }
    }

    static class RulesAssembler {
        static Function<Integer, String> apply(List<Rule> rules) {
            return number -> rules.stream().filter(rule -> rule.isMatch(number))
                    .map(rule -> rule.apply(number))
                    .collect(Collectors.joining());
        }
    }

    static String fizzBuzz(int number) {
        return Stream.of(new Contains7Rule(), new Contains5Rule(), new Contains3Rule(), new DefaultRule())
                .filter(rule -> rule.isMatch(number))
                .findFirst()
                .map(rule -> rule.apply(number))
                .orElseGet(() -> String.valueOf(number));
    }

}
