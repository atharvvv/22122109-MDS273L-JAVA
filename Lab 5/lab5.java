import java.util.*;

class Student {
    String regno;
    String full_Name;
    String emailAddress;
    String phonno;
    String studentClass;
    String department;

    public Student() {}

    public Student(String regno, String full_Name, String emailAddress, String phonno, String studentClass, String department) {
        this.regno = regno;
        this.full_Name = full_Name;
        this.emailAddress = emailAddress;
        this.phonno = phonno;
        this.studentClass = studentClass;
        this.department = department;
    }
    
    public void printDetails() {
        System.out.println("__________");
        System.out.println("Registration Number: " + regno);
        System.out.println("Full Name: " + full_Name);
        System.out.println("Phone Number: " + phonno);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Student Class: " + studentClass);
        System.out.println("Department: " + department);
        System.out.println("__________");
    } 
}

public class lab5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        
        String continueFlag;
        int cont;
        do {
            System.out.println("===============================");
            System.out.println("             MENU              ");
            System.out.println("===============================");
            System.out.println("1. Add a new Student");
            System.out.println("2. Search for a student");
            System.out.println("3. Show details of all students");
            System.out.println("===============================");
            int option = Integer.parseInt(scanner.next());
            scanner.nextLine();
            if (option == 1) {
                int count = 0;
                for (int i = 0; i < students.length; i++) {
                    if (students[i] != null) {
                        count++;
                    }
                }
                System.out.println("Enter the registration number of the student: ");
                String regno = scanner.nextLine();
                System.out.println("Enter the full name of the student: ");
                String full_Name = scanner.nextLine();
                System.out.println("Enter the phone number of the student: ");
                String phonno = scanner.nextLine();
                System.out.println("Enter the email address of the student: ");
                String emailAddress = scanner.nextLine();
                System.out.println("Enter the class of the student: ");
                String studentClass = scanner.nextLine();
                System.out.println("Enter the department of the student: ");
                String department = scanner.nextLine();

                students[count] = new Student(regno, full_Name, emailAddress, phonno, studentClass, department);
            } else if (option == 2) {
                int notNull = 0;
                for (int k = 0; k < students.length; k++) {
                    if (students[k] != null) {
                        notNull++;
                    }
                }
                System.out.print("Enter the name of the student you want the details of: ");
                String searchName = scanner.nextLine();
                boolean studentFound = false;
                for (int j = 0; j < notNull; j++) {
                    if ((students[j].full_Name).equals(searchName)) {
                        students[j].printDetails();
                        studentFound = true;
                        break;
                    }
                }
                if (!studentFound) {
                    System.out.println("No such student found!");
                }
            } else if (option == 3) {
                int nonNull = 0;
                for (int k = 0; k < students.length; k++) {
                    if (students[k] != null) {
                        nonNull++;
                    }
                }
                for (int c = 0; c < nonNull; c++) {
                    students[c].printDetails();
                }
            }
            
            System.out.println("To continue the program, press any number. Else, press 0");
            cont = scanner.nextInt();
        } while (cont != 0);
    }
}