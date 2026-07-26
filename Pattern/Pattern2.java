public class Pattern2 {
    public static void main(String[] args){
    pat(6);
    }
    public static void pat(int n)
    {
     for(int row=1; row <= n; row++)
     {
        for(int col=1;col <= row;col++){
            System.out.print("*");
        }
        System.out.println();
     }
    }
    

    
}
