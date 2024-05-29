package tugasBesar;

public class KRS {
	private Node head;

    public KRS() {
        this.head = null;
    }

    public void addCourse(String courseCode, String courseName, int sks) {
        Node newNode = new Node(courseCode, courseName, sks);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Course " + courseName + " has been added to the KRS.");
    }

    public void removeCourse(String courseCode) {
        Node current = head;
        Node previous = null;

        while (current != null && !current.courseCode.equals(courseCode)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Course with code " + courseCode + " not found.");
            return;
        }

        if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }

        System.out.println("Course " + current.courseName + " has been removed from the KRS.");
    }

    public void displayCourses() {
        Node current = head;
        if (current == null) {
            System.out.println("No courses in the KRS.");
            return;
        }

        while (current != null) {
            System.out.println("Course Code: " + current.courseCode + ", Course Name: " + current.courseName + ", SKS: " + current.sks);
            current = current.next;
        }
    }
}
