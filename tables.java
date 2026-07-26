import java.util.Scanner;

public class tables {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number which table u want:");
        int n = sc.nextInt();
        for(int i=1; i<=20; i++)
            System.out.println(n + " * " + i + " = " + n*i);
    }
}