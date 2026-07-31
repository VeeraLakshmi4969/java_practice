// public class fabinocci {
//     public static void main(String[] args) {
//         int a= 0;
//         int b=1;
//         int c;
//         System.out.println(1);
//         for (int x = 1;x<=30;x++){
//             c= a+b;
//             System.out.println(c);
    
//             a=b;
//             b= c;
//         }
//     }
    
// }
import java.util.*;
class fabinocci{
    public static void main(String args[]){
        for(int i = 0;i<30;i++){
            System.out.println(fib(i)+ " ");
        }
    }
    static int fib(int n){
     if(n==0)
        return 0;
    if(n==1)
        return 1;
    return fib(n-1)+fib(n-2);  }
}
