import java.util.*;

public class string {
    public static void main(String args[])

    {
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        word = sc.nextLine();
        System.out.println(word);
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.length());
        System.out.println(word.substring(2));
        System.out.println(word.substring(2, 4));
        System.out.println(word.concat("helloo"));
        System.out.println(word.trim());

    }

}
