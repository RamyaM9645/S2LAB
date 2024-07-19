import java.util.*;
//exercise 10
//method overloadinggggg
class shape_area {
    void area(int length, int breadth) {
        System.out.println("the area of rect is:" + length * breadth);
    }

    void area(float base, float h) {
        System.out.println("the area of triangle is:" + 0.5 * base * h);

    }

    void area(double l) {
        System.out.println("the area of square is:" + l * l);

    }

}

class area_main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        shape_area ob = new shape_area();

        System.out.println("enter length of retL:");
        int length = sc.nextInt();
        System.out.println("enter breadtof retL:");
        int breadth = sc.nextInt();
        ob.area(length, breadth);

        System.out.println("enter baseand height :");
        float base = sc.nextFloat();
        float h = sc.nextFloat();
        ob.area(base, h);

        System.out.println("enter side of square:");
        double l = sc.nextDouble();
        ob.area(l);

    }
}