import java.io.*;
import java.util.Scanner;

// Employee class
class Employee implements Serializable {
    private int empNo;
    private String empName;
    private int empBasic;

    // Parameterized constructor to initialize members
    public Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    // Getter methods
    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpBasic() {
        return empBasic;
    }
}

// Main class to handle input, file writing, and reading
public class WriteEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user to enter employee details
            System.out.print("Enter employee number: ");
            int empNo = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter employee name: ");
            String empName = scanner.nextLine();

            System.out.print("Enter employee basic salary: ");
            int empBasic = scanner.nextInt();

            // Create Employee object
            Employee employee = new Employee(empNo, empName, empBasic);

            // Write employee details to a file emp.txt
            FileOutputStream fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.close();
            fos.close();
            System.out.println("Employee details written to emp.txt file.");

            // Read employee details from the file
            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee empFromFile = (Employee) ois.readObject();
            ois.close();
            fis.close();

            // Display employee details read from the file
            System.out.println("\nEmployee details read from emp.txt file:");
            System.out.println("Employee Number: " + empFromFile.getEmpNo());
            System.out.println("Employee Name: " + empFromFile.getEmpName());
            System.out.println("Employee Basic Salary: " + empFromFile.getEmpBasic());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
