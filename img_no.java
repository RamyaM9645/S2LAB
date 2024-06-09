//imaginary numbers addition

import java.util.*;

class img_no {

    double real1,imaginary1;
    double real2, imaginary2;
    double realsum, imgsum;

    public static void main(String args[]) {
        img_no ob = new img_no(); // creating object ob for classs imgno
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter real part of complex number1: ");
        ob.real1 = sc.nextDouble();
        System.out.println("enter imaginary part  of complex number1: ");
        ob.imaginary1 = sc.nextDouble();

        System.out.println("enter real part of complexnumber2: ");
        ob.real2 = sc.nextDouble();
        System.out.println("enter imaginary part of  complex number2: ");
        ob.imaginary2 = sc.nextDouble();

        ob.realsum = ob.real1 + ob.real2;
        ob.imgsum = ob.imaginary1 + ob.imaginary2;

        System.out.println("sum of real numbers=  " + ob.realsum + "+" + ob.imgsum + "i");

    }

}