import java.util.*;

class fib implements Runnable{
    int limit;
    fib(int limit)
    {
        this.limit=limit;
    }
    public void run(){
        int a=0;
        int b=1;
        int c;
        for (int i=1;i<=limit;i++)
        {   
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;

        }
    }
}
class Even implements Runnable{
    int start,end;
    Even(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public void run()
    {
        for(int i=start ;i<=end;i++)
        {
            if(i%2==0)
            {
                System.out.println("even: "+i);
            }
        }
    }
}
public class fibThread  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit of fib: ");
        int limit=sc.nextInt();
        System.out.println("enetr ending range for even number: ");
        int start=sc.nextInt();
        System.out.println("enetr ending range for even number: ");

        int end=sc.nextInt();
        Thread f=new Thread(new fib(limit));
        Thread e=new Thread(new Even(start,end));
        f.start();
        e.start();
    }



    
}
