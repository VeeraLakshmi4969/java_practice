public class checkPrime {
   public static void main(String args[]){
    int n =  6;
    for(int i = 2; i<n; i++)
    {
        if(n%i == 0)
            System.out.println("not prime");
        return;
    }
    System.out.println("prime");
   } 
}
