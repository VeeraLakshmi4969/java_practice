public class SecMethod {
    public static void main(String args[])
    {
        int sum = 0;
        int a = 60;
        int b = 10;
        sum =  myMethod(a,b);
        // sum = myMethod(60,10);
        System.out.println("Sum of numbers is:" + sum);
    }
    static int myMethod(int x,int y)
    // we may pass same parameters a b also
    {
    return x+y;
}
}
