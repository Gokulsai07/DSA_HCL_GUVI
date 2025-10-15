public class  Palindromes{
public static void main(String[] args){
int num=121,rev=0,temp=num;
while(temp!=0){
int digit=temp%10;
rev=rev*10+digit;
temp/=10;
}
if(rev==num)
System.out.println(num+"is a palindrome.");
else
System.out.println(num+"is not a palindrome.");
}
}