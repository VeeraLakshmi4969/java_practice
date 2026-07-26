public class pattern1 {

    public static void main(String args[]){
        int n=5;
        //for rows
        for(int i=0;i<n;i++)
        {
            //spaces
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}