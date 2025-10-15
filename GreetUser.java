public class GreetUser{
public static void main(String[] args){
if(args.length<1){
System.out.println("Please provide a name.");
return;
}
String name=args[0];
System.out.println("Hello,"+name+"!");
}
}