import java.util.Scanner;

public class Reverse{
   public static void main(String args[])
   {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
   int rev=0;
   int r;
   //we can also write like for(;num!=0;num/=10)
   while(num>0)
   {
      r = num%10;
     rev=rev*10+r;
      num=num/10;
   }
   System.out.print(rev);
   }
}
