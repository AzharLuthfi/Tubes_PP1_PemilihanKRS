package tugasBesar;

public class Node {
	String courseCode;
    String courseName;
    int sks;
    Node next;

    public Node(String courseCode, String courseName, int sks) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.sks = sks;
        this.next = null;
    }
}
