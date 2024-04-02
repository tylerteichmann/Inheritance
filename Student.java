public class Student extends User {
    float gpa;

    public Student(String name) {
        super(name);
        System.out.println("Call the Student Constructor");
    }

    public String GetName() {
        return super.GetName() + " is a student.";
    }

    public String toString() {
        return super.GetName();
    }
}
