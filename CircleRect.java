//exercise 13
//createa a interface hvaing prototype area and perimeter.createa classes rectangle and circle which implemets interface
//create menu drivern prgm to find area nd perimeter of objects
import java.util.Scanner;

interface Shape {
    public void area();
    public void perimeter();
}

class Circle implements Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of circle is " + 3.14 * radius * radius);
    }
    public void perimeter() {
        System.out.println("Perimeter of circle is " + 3.14 * 2 * radius);
    }

}

class Rectangle implements Shape {
    int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of rectangle is " + length * breadth);
    }
    public void perimeter() {
        System.out.println("Perimeter of rectangle is " + 2 * (length + breadth));
    }
}

class CircleRect {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter your choice");
            System.out.println("\n1. Circle \n2. Rectangle \n3. Exit\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter radius: ");
                    int radius = sc.nextInt();
                    Circle c = new Circle(radius);
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    System.out.println("Enter length and breadth: ");
                    int length = sc.nextInt();
                    int breadth = sc.nextInt();
                    Rectangle re = new Rectangle(length, breadth);
                    re.area();
                    re.perimeter();
                    break;
                case 3:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice: ");
            }
        } while (ch != 3);

        sc.close();
    }
}
