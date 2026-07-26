public class Pattern5 {
    public static void main(String[] args){
    pat(6);
    }
    public static void pat(int n)
    {
     for(int row=1; row <= n; row++)
     {
        //for spaces
        for(int i=1;i<=row-1;i++)
        {
            System.out.print("  ");//2 space
        }
        for(int col=1;col <=n;col++){
            System.out.print("* ");//1 space
        }
        System.out.println();
     }
    
    }
}

    

