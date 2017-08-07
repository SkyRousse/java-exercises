package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashM {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newId;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            newId= 0;
            System.out.println("Student ID: ");

            if(in.findInLine("(?=\\S)") != null) {
                newId = in.nextInt();
                System.out.print("Name: ");
                String newName = in.next();
                students.put(newId, newName);

                // Read in the newLine before looping back
                in.nextLine();
            }
        } while (newId > 0);


        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
