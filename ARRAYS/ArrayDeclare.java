
import java.util.Scanner;
public class ArrayDeclare {
    public static void main(String[] args) {
        //Method 1
        int[] a;
        a = new int[5];


       //method 2
       int[]  b={1,3,5};
       System.out.println(b);//it print array address


       System.out.println(b[0]);
       b[1]=100;//modification
       System.out.println(b[1]);
       //TO PRINT ALL ELEMENTS
       for(int i=0;i<=2;i++)//here i access index
        System.out.print(b[i] + " ");

        //OR TO PRINT ALL ELEMENT WE CAN ALSO FOLLOW

        for(Integer i:b)//here i access array values directly
        //here Integer is a predefined class
        //we can use any variable
            System.out.println(i);



            //TAKING ARRAY VALUES FOR USER
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter array a values: ");
            for(int val=0;val<a.length;val++)
                a[val]=sc.nextInt();
            sc.close();

    }
    
}
