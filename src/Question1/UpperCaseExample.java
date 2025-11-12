package Question1;

import java.util.stream.Stream;

public class UpperCaseExample {
    public static void main(String[] args) {
        // Create a Stream of Strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Use map() to convert each string to uppercase
        names
                .map(String::toUpperCase) //  s -> s.toUpperCase()
                .forEach(System.out::println); // print each element
    }
}
/*
Output
        ABC
        D
        EF
*/
