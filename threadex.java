//exercise 17
//mul and prime using thread
import java.util.*;
class mul extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        { 
            int ans=i*5;
            System.out.println(i+"* 5 ="+ans);
        }
    }
}
class primee extends Thread
{
    private int n;
    primee(int n)
    {
        this.n=n;
    }
    private boolean primeornot(int num)
    {
        if(num <0)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num % i==0)
            {
                return false;
            }

        }
        return true;
    }
    public void run(){
        for(int i=1;i<=n;i++)
        {
            if(primeornot(i)==true)
            {
                System.out.println("prime:"+i);
            }
        }
        }

    }

public class threadex
{
    public static void main(String[] args) {
        mul obj1=new mul();
        obj1.start();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit of prime number:  ");
        int n=sc.nextInt();
        primee p=new primee(n);
        p.start();
    }
}