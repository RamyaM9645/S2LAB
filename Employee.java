
//exercise 8
import java.util.*;

public class Employee {
    int eNo;
    String eName;
    double eSalary;
    Scanner sc = new Scanner(System.in);

    public void read() {
        System.out.println("enter employee eNO: ");
        eNo = sc.nextInt();
        System.out.println("ename: ");
        eName = sc.next();
        System.out.println("emp salary :");
        eSalary = sc.nextDouble();
    }

    public void display() {
        System.out.println("name: " + eName);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        Employee emp[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read();
        }

        System.out.println("search........");
        System.out.println("enter id to searcgh : ");
        int idd = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == idd) {
                emp[i].display();
                break;
            }
        }
    }

}