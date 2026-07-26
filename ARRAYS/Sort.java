public class Sort{
    public static void main(String args[]){
        int[] arr={1,2,4,7,3,6,0,10};
        sortMeth(arr);
        for(Integer i:arr)
        System.out.print(i+" ");
    }
    static int[] sortMeth(int[] arr)
    {
        for(int turn=0;turn<arr.length;turn++){
             for(int i=0;i<arr.length-1;i++)
            if(arr[i]>arr[i+1])
            {
            swap(i,arr);
            }
           
        }
         return arr;
    }
    public static int[] swap(int i,int[] arr)
    {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
        return arr;
    } 
}
