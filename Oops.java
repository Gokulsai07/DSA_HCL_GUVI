class Oops{
    public static void main(String[] args){
//       oops: it is approach is to break a complex problem to smaller
// 1.simple class and object
// class Person{
// String name;
// int age;
// }
// public class Test1{
// psvm(String[] args){
// Person p=new Person();
// p.name="Aice";
// p.age=30;
// sop(p.name+"is"+p.age+"years old");
// }
// }
// 2.local variable
// class LocalVariableExample{
// void display(){
// int num=10;
// sop("local variable: "+num);
// }
// psvm)s[]a){
// LocalVariableExample obj=new LocalVariableExample();
// obj.display();
// }
// }
// 3. static variable
// class  StaticVariableExample{
// //note:static variable belong to the class and are shared among all objects of the class.
// static int counter=0;
// StaticVariableExample(){
// counter++;
// }
// static void displayCounter(){
//  sop("static counter");
//  }
// psvm(s[]a){
// new StaticVariableExample();
// new StaticVariableExample();
// StaticVariableExample.displayCounter();
// }
// }
// 4.instance variable example
// //note:instance variable are declared in a class but outside any method.they belong to a specific object
// class InstanceVariableExample{
// int id;

// InstanceVariableExample(int id){
// this.id=id;
// }
// void display();
// sop("Instance variable(ID): "+id);
// }
// psvm(s[]a){
// InstanceVariableExample obj=new InstanceVariableExample(101);
// obj.display();
// }
// }
// 5.static and Instance variable example
// class StaticInstanceExample{
// static String schoolName="abc";
// String studentName;
//  StaticInstanceExample(String studentName){
//  this.studentName=studentName;
// }
//  void display(){
// sop("school Name: "+studentName);
// sop("school Name: "+schoolName);
// }
// psvm(s[]a){
// StaticInstanceExample s1=new StaticInstanceExample("John");
// StaticInstanceExample s2=new StaticInstanceExample("alice");
// s1.display();
// s2.display();
// }
// }
// 6.local and instance variable combination
// class VariableExample{
// int instanceVar=20;
//  void show(){
//  int localVar=10;
//  Sop("Local variable: "+localVar);
//  sop("Instance variable: "+instanceVar);
//  }
// psvm(s[]a){
// VariableExample obj=new VariableExample();
// obj.show();
// }
// }
// 7.local variable scope 
// class LocalScopeExample{
// void calculateSum(){
// int a=5;
// int b=10;
// int sum=a+b;
// sop("sum: "+sum);
// }
// psvm(s[]a){
// LocalScopeExample obj=new LocalScopeExample();
// obj.calculateSum();
// }
// }
// 8.static method with static and local variables
// class StaticMethodExample{
// static int staticVar=50;

// static void show(){
// int localVar=30;
// sop("static variable: "+staticVar);
// sop("local variable: "+localVar);
// }
// psvm(s[]a){
// StaticMethodExample.show();
// }
// }
// 9.instance variable default value
// class InstanceDefaultValue{
// int age;
// void display(){
// sop("default value of instance variable age: "+age);
// }
// psvm(s[]a){
// InstanceDefaultValue obj=new InstanceDefaultValue();
// obj.display();
// }
// }
// //it's print zero value
// 10.mix of all variable types
// class VariableMix{
// static String country="USA";
// int year;

// VariableMix(int year){
// this.year=year;
// }
// void display(){
// String city="New York";
// sop("Country:"+country);
// sop("city: "+city);
// sop("year: "+year);
// }
// psvm(s[]a){
// VariableMix obj=new VariableMix(2023);
// 11.local variable in loop
// class LocalVariableLoop{
// void printNumbers(){
// for(int i=1;i<=5;i++){
// sop("Number: "+i);
// }
// }
// psvm(s[]a){
// LocalVariableLoop obj=new LocalVariableLoop();
// obj.printNumbers();
// }
// }
// 12.static variable shared among objects
// class StaticShared{
// static int sharedVar=0;
// void increment(){
// sharedVar++;
// }
// void display(){
// sop("shared Variable: "+sharedVar);
// }
// psvm(s[]a){
// StaticShared obj1=new StaticShared();
// StaticShared obj2=new StaticShared()';
// obj1.increment();
// obj2.increment();
// obj1.display();
// }
// }
// 13.Instance variable initialized foe each object
// class InstanceInitialization{
// int instanceVar;
// InstanceInitialization(int value){
// this.instanceVar=value;
// }
// void display(){
// sop("Instance variable: "+instanceVar);
// }
// 14.static block initialization
// class StaticBlockExample{
// static int staticVar;
// static{
// staticVar=50;
// }
// void display(){
// sop("static variable: "+staticVar);
// }
// psvm(s[]a){
// StaticBlockExample obj=new StaticBlockExample();
// obj.display();
// }
// }
// 15.access the instance
// class InstanceAccess{
// int age;

// void setAge(int age){
// this.age=age;
// }
// void displayAge(){
// sop("Age: "+age);
// }
// psvm(s[]a){
// InstanceAccess obj=new InstanceAccess();
// obj.setAge(25);
// obj.displayAge();
// }
// }
// 16.local variable shadowing
// class VariableShadowing{
// int num=20;
// void display(){
// int num=10;
// sop("local variable: "+num);
// sop("instance variable: "+this.num);
// }
// psvm(s[]a){
// VariableShadowing obj=new VariableShadowing();
// obj.display();
// }
// }
// 17.modify static variable
// class ModifyStaticVariable{
// static int value=100;
// void modifyValue(){
// value+=50;
// }
// void displayValue(){
// sop("static value: "+value);
// }
// psvm(s[]a){
// ModifyStaticVariable obj1=new ModifyStaticVariable();
// ModifyStaticVariable obj2=new ModifyStaticVariable();
// obj1.displayValue();
// obj2.displayValue();
// }
// }
// 18.final local variable
// class FinalLocalVariable{
// void displayVariable{
// final int num=30;
// sop("Final local variable: "+num);
// }
// psvm(s[]a){
// FinalLocalVariable obj=new FinalLocalVariable();
// obj.display();
// }
// }
   
    }
}