import java.util.Scanner;

public class lab10Q1 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in); // Create Scanner object
        System.out.print("Input: ");
        
        try {
            a = Integer.parseInt(in.nextLine()); // Read input and parse as integer
            System.out.println("Number entered is " + a); // Print the valid integer
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer."); // Handle exception
        } finally {
            in.close(); // Close the Scanner
        }
    }
}

