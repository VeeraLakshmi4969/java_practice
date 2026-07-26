import java.util.Scanner;

public class largestArrayEle {
    public static void main(String args[])
    {
       
        int[] arr= new int[7];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         int largest=meth(arr);
         System.out.println(largest);
         sc.close();
         }
        static int  meth(int a[])
    {
        int max=0;
         //OR max=Integer.MIN_VALUE;
         //it will take min integer value
         for(int i=0;i<a.length;i++)
         {
            if(max < a[i]){
                max=a[i];
                //OR max=Math.max(max,arr[i])
            }
        
    }
     return max;
}
    
}
