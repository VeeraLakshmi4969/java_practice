import java.util.Scanner;
public class ReverseofNum {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        System.out.println( meth(n));
    }

public static void meth(int n)
{
    int rev=0;
        int rem;
        while(n!=0)
        {
           rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }


    }
}
