/**
 * 
 */

/**
 * @author vgupta
 *
 */
class Student {
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Your code goes here
    int i=1;
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }
}