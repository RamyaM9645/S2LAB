//average of n postive integers,raise a userdefined exception for each negative input

import java.util.*;
class negativeException extends Exception{
    negativeException(String msg)
    {
        super(msg);
    }
}
class average{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of elemets: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        
        System.out.println("enter the numbers: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

            try{
                if(arr[i]<0)
                {
                    throw new negativeException("negative numebr is not allowed.");                 
                    
                }
                else{
                    sum=sum+arr[i];
                   
                    
                }

            }
            catch(negativeException e){
               System.out.println( e.getMessage());
               System.exit(0);

            }
        }
        double average=(double)sum/n;
         System.out.println("average ="+average);


    }
}