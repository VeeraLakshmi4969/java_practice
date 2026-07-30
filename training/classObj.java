class classObj{
public static void main(String args[])
{
Student s1 = new Student(104,"Ram");
System.out.println(s1);   //Student@2bea5ab4 this is obj s1 that belong to student
s1.speak();
Student s2 = new Student(103,"Hari");
System.out.println(s2.name);
s2.beat();
System.out.println(s1.name);
}
}
class Student{
String name;
int roll ;
Student(int roll, String name){
this.roll=roll;
this.name =name;
}
void speak(){
System.out.println("speaking");
}
void beat()
{
System.out.println("beating");
}
}