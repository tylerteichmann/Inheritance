/**
 * Inheritance
 */
public class Inheritance {
    public static void main(String[] args) {
        
        int[] arr = new int[3];

        System.out.println("This is before the exception");

        try {
            int value = arr[-1];
        } catch(Exception exception) {
            System.out.println("Exception: " + exception);
        } finally {
            System.out.println("Hit the finally");
        }
        
        System.out.println("This is after the exception");

        Student student = new Student("Tyler");
        student.gpa = 3.0f;

        System.out.println(student.GetName());

        Instructor instructor = new Instructor("Melissa");
        instructor.salary = 80000.00;

        System.out.println(User.nextId);

        System.out.println(student instanceof Student);
        System.out.println(student instanceof User);
        System.out.println(instructor instanceof User);

        Triangle triangle = new Triangle(5, 10);
        System.out.println(triangle.GetArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.GetArea());

        Circle circle = new Circle(5);
        System.out.println(circle.GetArea());

    }
}