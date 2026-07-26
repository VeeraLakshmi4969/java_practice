class linearSearch{
public static void main(String args[])
{
boolean found = false;
int arr[]= {1,98,20,74,108,3};
int target = 20;
for(int i = 0;i<arr.length;i++)
{
if(arr[i]==target){
System.out.println("Target found at index "+ i);
found = true;
break;
}
}
if(found == false){
System.out.println("Your target not found");
}
}
}`