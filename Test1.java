import java.util.Scanner;
class Person{
String name;
int age;
}
public class Test1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Person p=new Person();
System.out.println("Enter  name");
p.name=sc.nextLine();
System.out.println("Enter  age");
p.age=sc.nextInt();
System.out.println(p.name+" is "+p.age+" years old");
}
}