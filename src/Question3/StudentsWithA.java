package Question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsWithA {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> students = Arrays.asList(
                "Arun", "Bala", "Anita", "Kumar", "Aishwarya",
                "Divya", "Ajay", "Rahul", "Akash", "Sneha"
        );

        // Use Stream and Lambda to filter names starting with "A"
        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}
/*

output
Students whose names start with 'A': [Arun, Anita, Aishwarya, Ajay, Akash]
*/
