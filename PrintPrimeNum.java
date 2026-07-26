import java.util.Scanner;

public class PrintPrimeNum {
public static void main(String[] args) {
    int n;
    for(n=10;n<100;n++){
    boolean bool= check(n);

    if(bool == true)
    {
        System.out.println(n + " ");
    }
}}
    static boolean check(int n)
    {
        for(int i = 2;i<n;i++){
            if (n%i == 0){
                return false;}
            }
            return true;
        }
    }