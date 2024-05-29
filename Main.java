package tugasBesar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        
        Student student = new Student(studentId, studentName);
        
        int choice;

        do {
            System.out.println("\nKRS Management System");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Courses");
            System.out.println("4. Display Student Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter course SKS: ");
                    int sks = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    student.getKRS().addCourse(courseCode, courseName, sks);
                    break;
                case 2:
                    System.out.print("Enter course code to remove: ");
                    String codeToRemove = scanner.nextLine();
                    student.getKRS().removeCourse(codeToRemove);
                    break;
                case 3:
                    System.out.println("\nCourses in KRS:");
                    student.getKRS().displayCourses();
                    break;
                case 4:
                    student.displayStudentInfo();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
