public class insertionSort {
    public static void main(String[] args) {
        int arr[]={12,11,13,5,6};
        sort(arr);
        for(Integer i:arr)
            System.out.println(i);
    }
    public static void sort(int[] arr){
        for(int i=1;i<arr.length;i++)
        {
            int cur= arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>cur)
            {
                arr[prev+1] =  arr[prev];
                prev--;
            }
            // FIXED: Since prev decreased to -1 (or stopped early), 
            // the correct insertion spot is at prev + 1
            arr[prev+1]=cur;
        }

    }
}
