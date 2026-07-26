public class BinarySearch{
    public static void main(String a[]){
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int k=9;
        int res=check(arr,k);
        System.out.println(res);
        
    }
    static int check(int[] a,int k){
        int start,end,mid;
        start=0;
        end=a.length;
        while(start<=end){
        mid=(start+end)/2;
        if(a[mid] == k){
            return mid;
        }
        else if(a[mid]>k){
            end=mid-1;
        }
        else if(a[mid]<k){
            start=mid+1;
        }
        }
        return -1;
    }
}