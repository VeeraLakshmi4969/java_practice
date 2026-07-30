class extension{
public static void main(String args[])
{
C c = new C();
c.say();
c.cry();
c.walk();
}
}
class A{
void say();{
System.out.println("hello");
}
}
class B extends A{
void cry();
}
class C extends B{
void walk();
}