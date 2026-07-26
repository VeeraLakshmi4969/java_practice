public class PrimeNum {
    public static void main(String[] args) {
        int n =6;
        String res = "";
        for(int i = 2;i<20;i++){
            if(n%i == 0){
                res = "not a prime";
                break;
            }}
            /*we can also  use
               int count = 0;
                  count++;
                   if (count == 2) {
                System.out.println(i);
                in this situation loop must start with 1
                 for (int j = 1; j <= i; j++)
            }*/
            if (res == ""){
                System.out.println("num is prime");
            }
            else{
                System.out.println("num is not prime");
            }
    }
    
}
