import java.util.*;

class Student {
    String regNumber;
    String fullName;
    String emailAddress;
    String phoneNumber;
    String studentClass;
    String department;

    public Student() {}

    public Student(String regNumber, String fullName, String emailAddress, String phoneNumber, String studentClass, String department) {
        this.regNumber = regNumber;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.studentClass = studentClass;
        this.department = department;
     }
    
    public void printDetails() {
        System.out.println("__________");
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Phone Number: " + phoneNumber);
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
            int option = Integer.parseInt(scanner.nextLine());

            switch(option) {
                case 1:
                    int count = 0;
                    for(int i = 0; i < students.length; i++) {
                        if(students[i] != null) {
                            count++;
                        }
                    }
                    System.out.println("Enter the registration number of the student: ");
                    String regNumber = scanner.nextLine();
                    System.out.println("Enter the full name of the student: ");
                    String fullName = scanner.nextLine();
                    System.out.println("Enter the phone number of the student: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Enter the email address of the student: ");
                    String emailAddress = scanner.nextLine();
                    System.out.println("Enter the class of the student: ");
                    String studentClass = scanner.nextLine();
                    System.out.println("Enter the department of the student: ");
                    String department = scanner.nextLine();

                    students[count] = new Student(regNumber, fullName, emailAddress, phoneNumber, studentClass, department);
                    break;

                case 2:
                    int notNull = 0;
                    for(int k = 0; k < students.length; k++) {
                        if(students[k] != null) {
                            notNull++;
                        }
                    }
                    System.out.print("Enter the name of the student you want the details of: ");
                    String searchName = scanner.nextLine();
                    boolean studentFound = false;
                    for(int j = 0; j < notNull; j++) {
                        if((students[j].fullName).equals(searchName)) {
                            students[j].printDetails();
                            studentFound = true;
                            break;
                        }
                    }
                    if(!studentFound) {
                        System.out.println("No such student found!");
                    }
                    break;

                case 3:
                    int nonNull = 0;
                    for(int k = 0; k < students.length; k++) {
                        if(students[k] != null) {
                            nonNull++;
                        }
                    }
                    for(int c = 0; c < nonNull; c++) {
                        students[c].printDetails();
                    }
                    break;
            }
            System.out.println("To continue the program, press any number. Else, press 0");
            cont = scanner.nextInt();
        }while(cont != 0);
    }
}