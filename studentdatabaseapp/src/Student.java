import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOFCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);


    }
    
    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID =  gradeYear + "" + id;
    }


    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status
}
