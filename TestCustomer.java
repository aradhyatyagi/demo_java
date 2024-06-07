import java.util.Scanner;

// User-defined exception class
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

// Customer class with validations
class Customer {
    private String custNo;
    private String custName;
    private String category;

    // Parameterized constructor with validations
    public Customer(String custNo, String custName, String category) throws InvalidInputException {
        if (!custNo.startsWith("C") && !custNo.startsWith("c")) {
            throw new InvalidInputException("Customer number must start with 'C' or 'c'.");
        }
        if (custName.length() < 4) {
            throw new InvalidInputException("Customer name must be at least 4 characters long.");
        }
        if (!category.equals("Platinum") && !category.equals("Gold") && !category.equals("Silver")) {
            throw new InvalidInputException("Category must be either 'Platinum', 'Gold', or 'Silver'.");
        }
        this.custNo = custNo;
        this.custName = custName;
        this.category = category;
    }

    // Getter methods
    public String getCustNo() {
        return custNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getCategory() {
        return category;
    }
}

// TestCustomer class with main method
public class TestCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter customer details
            System.out.print("Enter customer number: ");
            String custNo = scanner.nextLine();

            System.out.print("Enter customer name: ");
            String custName = scanner.nextLine();

            System.out.print("Enter customer category (Platinum/Gold/Silver): ");
            String category = scanner.nextLine();

            // Create Customer object
            Customer customer = new Customer(custNo, custName, category);

            // Print customer details
            System.out.println("Customer details:");
            System.out.println("Customer Number: " + customer.getCustNo());
            System.out.println("Customer Name: " + customer.getCustName());
            System.out.println("Customer Category: " + customer.getCategory());

        } catch (InvalidInputException e) {
            // Handle the custom exception
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
