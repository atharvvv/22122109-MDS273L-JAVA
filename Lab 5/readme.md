# Student Manager

This Java program allows you to manage a list of students using classes and objects. The program presents a menu with three options: add a new student, search for a student by name, or show details of all students in the list.

## Getting Started

1. Clone the repository to your local machine.
2. Compile the code using a Java compiler.
3. Run the compiled code using `java lab5`.

## Usage

1. Upon running the program, a menu will be displayed with three options.
2. To add a new student, select option 1 and enter the student's information as prompted.
3. To search for a student, select option 2 and enter the student's name as prompted.
4. To display details of all students in the list, select option 3.
5. To exit the program, enter 0 when prompted to continue after selecting an option.

## Solution 
```import java.util.*;

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
}```

## Output:
``` ===============================
             MENU
===============================
1. Add a new Student
2. Search for a student
3. Show details of all students
===============================
1
Enter the registration number of the student: 
543456
Enter the full name of the student: 
Atharva vetal
Enter the phone number of the student: 
34567654
Enter the email address of the student: 
vetal@123
Enter the class of the student: 
MSDS
Enter the department of the student: 
Data Science
To continue the program, press any number. Else, press 0
1
===============================
             MENU
===============================
1. Add a new Student
2. Search for a student
3. Show details of all students
===============================
1
Enter the registration number of the student:
543456434
Enter the full name of the student:
keegan f
Enter the phone number of the student:
6543456543
Enter the email address of the student:
keegan@123
Enter the class of the student:
Data Science
Enter the department of the student:
Data Science
To continue the program, press any number. Else, press 0
1
===============================
             MENU
===============================
1. Add a new Student
2. Search for a student
3. Show details of all students
===============================
2
Enter the name of the student you want the details of: Atharva vetal
__________
Registration Number: 543456
Full Name: Atharva vetal
Phone Number: 34567654
Email Address: vetal@123
Student Class: MSDS
Department: Data Science
__________
To continue the program, press any number. Else, press 0
1
===============================
             MENU
===============================
1. Add a new Student
2. Search for a student
3. Show details of all students
===============================
Registration Number: 543456434
Full Name: keegan f
Phone Number: 6543456543
Email Address: keegan@123
Student Class: Data Science
Department: Data Science
__________
To continue the program, press any number. Else, press 0
1
===============================
             MENU
===============================
1. Add a new Student
2. Search for a student
3. Show details of all students
===============================
3
__________
Registration Number: 543456
Full Name: Atharva vetal
Phone Number: 34567654
Email Address: vetal@123
Student Class: MSDS
Department: Data Science
__________
__________
Registration Number: 543456434
Full Name: keegan f
Phone Number: 6543456543
Email Address: keegan@123
Student Class: Data Science
Department: Data Science
__________
To continue the program, press any number. Else, press 0 ```
