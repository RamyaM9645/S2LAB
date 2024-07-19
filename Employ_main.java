//employe=>teacher
import java.util.*;

class Eemployee {
    Scanner sc = new Scanner(System.in);
    int Empid;
    String name, address;
    double salary;

    Eemployee(int x) {
        System.out.println("\n\t\tEnter Details of Teacher " + x);
        System.out.print("Enter Employee Id: ");
        Empid = sc.nextInt();
        System.out.print("Enter Employee Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        System.out.print("Enter Address: ");
        address = sc.next();
    }
}

class Tteacher extends Eemployee {
    Scanner sc = new Scanner(System.in);
    String dept, subject[];
    int no;

    Tteacher(int x) {
        super(x);
        System.out.print("Enter Department: ");
        dept = sc.next();
        System.out.print("Enter no:of subjects taught: ");
        no = sc.nextInt();
        subject = new String[no];
        System.err.print("Enter list of subjects: ");
        for (int i = 0; i < no; i++)
            subject[i] = sc.next();
    }

    void display(int n) {
        System.out.println("\n\t\tTeacher " + n + " Details");
        System.out.println("Employee Id: " + Empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.print("Subjects: ");
        for (int i = 0; i < no; i++)
            System.out.print(subject[i] + " ");
    }
}

class Employ_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no:of teachers: ");
        int n = sc.nextInt();
        Tteacher t[] = new Tteacher[n];
        for (int i = 0; i < n; i++)
            t[i] = new Tteacher(i + 1);
        for (int i = 0; i < n; i++)
            t[i].display(i + 1);
    }
}