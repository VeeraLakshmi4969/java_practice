public class charPattern1 {
    public static void main(String args[]){
    int rows=5;
    int num=65;
    for(int i=0;i<rows;i++){
     for(int j=0;j<=i;j++)
     {
        char ch=((char)(num+j));
        System.out.print(ch+" ");
     }
     System.out.println();
    }
}
}
