

public class ArrayMethod{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        modifiedMethod(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void modifiedMethod(int a[]){
    a[2]=22;
    }
}
