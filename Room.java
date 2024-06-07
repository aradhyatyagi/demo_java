public class Room {
    // Attributes
    private int roomNo;
    private String roomType;
    private double roomArea;
    private boolean hasACMachine;

    // Setter method to set data
    public void setData(int roomNo, String roomType, double roomArea, boolean hasACMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.hasACMachine = hasACMachine;
    }

    // Display data method
    public void displayData() {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea + " square meters");
        System.out.println("AC Machine Installed: " + (hasACMachine ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Creating an instance of Room
        Room room = new Room();

        // Setting data using setData method
        room.setData(101, "Single", 25.5, true);

        // Displaying data using displayData method
        room.displayData();
    }
}

            
    
    

