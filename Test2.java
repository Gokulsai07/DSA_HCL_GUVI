// class Demo{
// Demo(){
// this(10);
// System.out.println("Default constructor");
// }
// Demo(int x){
// System.out.println("Parameterized constructor: "+x);
// }
// }
// public class Test2{
// public static void main(String[] args){
// new Demo();
// }
// }
class Item{
String name;
}
public class Test2{
public static void main(String[] args){
Item[] items={new Item(),new Item()};
items[0].name="pen";
items[1].name="bar";
System.out.println(items[0].name + items[1]);
}
}