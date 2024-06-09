//linear search in array

import java.util.Scanner;

class array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of elemets: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array elemnts are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter elemets to be search: ");
        int ele=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {  
            if(arr[i]==ele)
            {
            System.out.println("elemnt presernt at location  "+i);
            found=true;
            break;
            }
        }
           if(found!=true){
            System.out.println("element not present");
            
            
        }


}
    }
 
