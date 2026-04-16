import java.util.Scanner;

public class pr11 {
    String collegeName;

    public pr11(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        void readData() {
            Scanner sc = new Scanner(System.in);
            studentName = sc.nextLine();
            course = sc.nextLine();
        }

        void display() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String college = sc.nextLine();
        pr11 c = new pr11(college);

        pr11.Admission a = c.new Admission();
        a.readData();
        a.display();
    }
}
//output
//Enter college name:
//ABC College
//Enter student name and course:
//John
//Computer Science
//College Name: ABC College
//Student Name: John
//Course: Computer Science
