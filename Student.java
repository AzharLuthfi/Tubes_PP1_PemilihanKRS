package tugasBesar;

public class Student {
	private String studentId;
    private String studentName;
    private KRS krs;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.krs = new KRS();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public KRS getKRS() {
        return krs;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
    }
}
