public class SelectionSort {
    public static void main(String args[]){
        int arr[]={20,1,15,10,2};
        sort(arr);
        for(Integer i:arr)
            System.out.println(i);
    }
    public static void sort(int[] arr)
    {
        int min;

        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[min] > arr[j])
                {
                    min=j;
                    
                }
            }
             // 2. SWAP MUST BE HERE: Inside the 'i' loop, outside the 'j' loop
             swap(arr,i,min);
        }
       
    }
    public static void swap(int arr[], int i , int min)
    {
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }

}

//OR
/*public class SelectionSort{
    public static void main(String args[]){
        int arr[]={20,12,15,10,2};
        sort(arr);
        for(Integer p:arr)
       {  
        System.out.println(p);
    }
    }
    public static int[] sort(int[] arr)
    {
        int min;
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        return arr;
    }
    public static void swap(int arr[],int i,int min)
    {
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
}*/