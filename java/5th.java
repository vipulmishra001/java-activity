import java.io.*;
import java.util.Scanner;

public class DisplayFileWithLineNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for file name
        System.out.print("Enter the file name (with path if needed): ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        // Check if file exists
        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }

        // Try reading the file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            boolean isEmpty = true;

            System.out.println("\n--- File Content ---\n");

            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + " | " + line);
                lineNumber++;
                isEmpty = false;
            }

            if (isEmpty) {
                System.out.println("The file is empty.");
            } else {
                System.out.println("\n--- End of File ---");
                System.out.println("Total lines: " + (lineNumber - 1));
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
