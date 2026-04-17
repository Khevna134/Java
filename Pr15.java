class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String project;

    Manager(String name, String department, int teamSize, String project) {
        super(name, department);
        this.teamSize = teamSize;
        this.project = project;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class pr15 {
    public static void main(String[] args) {
        Employee e = new Employee("John", "HR");
        Manager m = new Manager("Alice", "IT", 10, "AI System");

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();
    }
}
//output
//Employee Details:
//Name: John
//Department: HR

//Manager Details:
//Name: Alice
//Department: IT
//Team Size: 10
//Project: AI System
