
public class powerRec {
    public static void main(String[] args) {
        System.out.print(pow(2,7));
    }
    static int pow(int a,int b){
        if(b==0){
            return 1;
        }
        if(b==1)
            return a;
        return a*pow(a,b-1);
    }
}
