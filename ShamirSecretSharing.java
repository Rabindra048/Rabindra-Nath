import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ShamirSecretSharing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a category for output:");
        System.out.println("1. Mathematics Operations");
        System.out.println("2. String Operations");
        System.out.println("3. Date and Time");
        System.out.println("4. Random Values");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                mathematicsOperations();
                break;
            case 2:
                stringOperations();
                break;
            case 3:
                dateTimeOperations();
                break;
            case 4:
                randomValues();
                break;
            default:
                System.out.println("Invalid choice! Please choose between 1 and 4.");
        }
        
        scanner.close();
    }

    // Category 1: Mathematics Operations
    public static void mathematicsOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a math operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.print("Enter your choice (1-2): ");
        int mathChoice = scanner.nextInt();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        if (mathChoice == 1) {
            System.out.println("Result (Addition): " + (num1 + num2));
        } else if (mathChoice == 2) {
            System.out.println("Result (Multiplication): " + (num1 * num2));
        } else {
            System.out.println("Invalid math operation choice.");
        }
    }

    // Category 2: String Operations
    public static void stringOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a string operation:");
        System.out.println("1. Convert to Uppercase");
        System.out.println("2. Reverse String");
        System.out.print("Enter your choice (1-2): ");
        int stringChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        if (stringChoice == 1) {
            System.out.println("Uppercase String: " + inputStr.toUpperCase());
        } else if (stringChoice == 2) {
            System.out.println("Reversed String: " + new StringBuilder(inputStr).reverse().toString());
        } else {
            System.out.println("Invalid string operation choice.");
        }
    }

    // Category 3: Date and Time
    public static void dateTimeOperations() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Choose a date/time operation:");
        System.out.println("1. Current Date");
        System.out.println("2. Current Time");
        System.out.print("Enter your choice (1-2): ");
        Scanner scanner = new Scanner(System.in);
        int dateTimeChoice = scanner.nextInt();
        
        if (dateTimeChoice == 1) {
            System.out.println("Current Date: " + now.format(dateFormatter));
        } else if (dateTimeChoice == 2) {
            System.out.println("Current Time: " + now.format(timeFormatter));
        } else {
            System.out.println("Invalid date/time choice.");
        }
    }

    // Category 4: Random Values
    public static void randomValues() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a random operation:");
        System.out.println("1. Generate Random Number");
        System.out.println("2. Generate Random String");
        System.out.print("Enter your choice (1-2): ");
        int randomChoice = scanner.nextInt();
        
        if (randomChoice == 1) {
            int randomNumber = random.nextInt(100); // Random number between 0-99
            System.out.println("Random Number: " + randomNumber);
        } else if (randomChoice == 2) {
            String randomString = generateRandomString(8); // Random string of length 8
            System.out.println("Random String: " + randomString);
        } else {
            System.out.println("Invalid random operation choice.");
        }
    }

    // Helper function to generate random string
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomStr = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            randomStr.append(chars.charAt(index));
        }
        return randomStr.toString();
    }
}
