import java.util.Scanner;

class product {
    int pcode;
    String pname;
    int price;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pcode: ");
        pcode = sc.nextInt();
        System.out.println("enter pname: ");
        pname = sc.next();
        System.out.println("enter price: ");
        price = sc.nextInt();
    }

    public static void main(String[] args) {
        product ob = new product();
        product ob1 = new product();
        product ob2 = new product();

        ob.read();
        ob1.read();
        ob2.read();

        if (ob.price < ob1.price && ob.price < ob2.price) {
            System.out.println(ob.price + "is lower");
        } else if (ob1.price < ob.price && ob1.price < ob2.price) {
            System.out.println(ob1.price + "is lower");
        } else {
            System.out.println(ob2.price + "is lower");
        }

    }

}