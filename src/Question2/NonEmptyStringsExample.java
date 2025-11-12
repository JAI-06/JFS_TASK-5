package Question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringsExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter out empty strings
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty()) // keep only non-empty strings
                .collect(Collectors.toList());

        // Print the non-empty strings
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}
/*
output
Non-empty strings: [abc, bc, efg, abcd, jkl]
*/
