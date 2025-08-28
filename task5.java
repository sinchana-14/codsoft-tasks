import java.util.*;
public class Student {
    String name;
    int roll;
    String grade;
    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Grade: " + grade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    students.add(new Student(name, roll, grade));
                    System.out.println("Student added.");
                    break;
                case 2:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.roll == searchRoll) {
                            System.out.println("Found: " + s);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Student not found.");
                    break;
                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No students added yet.");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
