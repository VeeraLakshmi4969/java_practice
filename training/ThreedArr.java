import java.util.Scanner;
class ThreedArr{
public static void main(String args[])
{
int arr[][]=new int[3][3];
Scanner sc = new Scanner(System.in);
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++)
{
arr[i][j]=sc.nextInt();
}}
for(int k=0;k<arr.length;k++){
for(int l=0;l<arr.length;l++)
{

System.out.print(arr[k][l]+" ");
}
System.out.println();
}
}
}