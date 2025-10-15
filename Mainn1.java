//check if i th bit is set
public class checkIthBit{
public static void main(String[] args){
int n=13;
int i=2;
int mask=1<<i;
if((n&mask)!=0)
System.out.println("Bit "+i+" is set");
else
System.out.println("Bit "+i+" is not set");
}
}
//set the i th bit
public class Mainn1{
public static void main(String[] args){
int n=9;
int i=1;
int mask=1<<i;
n=n|mask;
System.out.println("new number: "+n);
}
}
