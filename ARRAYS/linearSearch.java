import java.util.Scanner;

public class linearSearch {
    public static void main(String args[])
    {
        int[] arr= new int[7];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number that you want to search:");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            {
                System.out.println("your num found in array at index: "+i);
                  break;//optional
           
            }
            else
                System.out.println("not found");
          
        }
 sc.close();
    }
    
}
