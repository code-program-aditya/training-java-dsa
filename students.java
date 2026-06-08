public class students {
    int roll;
    String name;

    // Default constructor
    public students() {
        this(10, "bhavy"); // Calls parameterized constructor
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // Another constructor with different parameters
    public students(int x, String name, boolean showOnlyX) {
        System.out.println(x);
        this.name = name;
    }

    // Method to display details
    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
        students s1 = new students(); // Calls default constructor
        s1.display();

        students s2 = new students(20, "Aditya"); // Calls parameterized constructor
        s2.display();

        students s3 = new students(30, "Test", true); // Calls third constructor
        s3.display();
    }
}
