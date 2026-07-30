class Main1{
public static void main(String args[])
{
laptop l1 = new laptop();
l1.run();
l1.close();
}
}class Computer{
int ram;
String chip;
void run(){
System.out.println("cpu is running");
}}
class laptop extends Computer{
void close(){
System.out.println("laptop us closed");
}
}