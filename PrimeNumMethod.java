import java.util.Scanner;

public class PrimeNumMethod {
  public static void main(String args[])
  {
   Scanner s= new Scanner(System.in);
   System.out.println("enter a number");
   int n = s.nextInt();
   boolean bool = check(n);
   if(bool == true)
    System.out.println("prime");
  else
    System.out.println("not prime");
}
public static boolean check(int n){
  for(int i=2; i<n; i++){
    if(n%i==0)
      return false;
  }
  return true;
}
}

