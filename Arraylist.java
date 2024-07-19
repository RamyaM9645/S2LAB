import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> list =new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String ele;
        int ch;
        do{
            System.out.println("1.Add element\n2.size \n3.seach by index \n4.find index \n5.display \n6.remove elemet \n7.exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the element to be added");
                    ele=sc.next();
                    list.add(ele);
                    break;

                case 2:
                     System.out.println("size of the list is "+list.size());
                     break;

                case 3:
                    System.out.println("eneter the index to search:");
                    int index=sc.nextInt();
                    System.out.println(list.get(index));
                    break;

                case 4:
                    System.out.println("enter the ele to search: ");
                    ele=sc.next();
                    index=list.indexOf(ele);

                case 5:
                     System.out.println("The elements in the list are: "+list);
                     break;
                case 6:
                    System.out.println("enter the elemet to remove: ");
                    ele=sc.next();
                    list.remove(ele);
                    System.out.println("after removing ele: "+list);
                    break;

                case 7:
                    break;
                    

                
            }

        }while(ch!=7);    
}
}