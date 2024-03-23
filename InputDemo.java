import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter some text: ");
            String input = scanner.nextLine(); // Read user input
            System.out.println("You entered: " + input); // Echo the input back
        } catch (Exception e) { // Catch a general exception (for demonstration)
            System.err.println("An error occurred during input. Please try again.");
        } finally {
            scanner.close(); // Always close the scanner to prevent resource leaks
        }
    }
}
