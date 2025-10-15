import java.util.StringJoiner;
// ...existing code...
public class StringExamples{
    public static void main(String[] args){
    //1. String length
    // String str="Hello World";
    // System.out.println("Length: "+str.length());   
    //2.String uppercase
    // String str="hello";
    // System.out.println(str.toUpperCase());

// 3.String lowercase
// String str="HELLO";
// System.out.println(str.toLowerCase());
// 4.concatenate strings
// String str1="HELLO";
// String str2="world";
// System.out.println(str1+" "+str2);
// 5.compare strings
// String a="HELLO";
// String b="HELLO";
// System.out.println(a.equals(b));
// 6.compare strings ignore case
// String a="Hello";
// String b="hello";
// System.out.println(a.equalsIgnoreCase(b));
// 7.string contains
// String str="Java programming";
// System.out.println(str.contains("Java"));
// 8.starts with
// String str="OpenAI GPT";
// System.out.println(str.startsWith("Open"));
// 8.Ends with
// String str="Java program";
// System.out.println(str.endsWith("program"));
// 9.Substring
// String str="programming";
// System.out.println(str.substring(3,7));
// 10.Index of character
// String str="banana";
// System.out.println(str.indexOf('a'));
// 11.last index of character
// String str="banana";
// System.out.println(str.lastIndexOf('a'));
// 12.replace characters
// String str="car";
// System.out.println(str.replace('c','b'));
// 13.replace substring
// String str="I love Java";
// System.out.println(str.replace("Java","Python"));
// 14.Trim spaces
// String str="hello";
// sop(str.trim());
// 15.split string
// String str="apple,banana,orange";
// String[] fruits=str.split(",");
// for(String fruit : fruits){
// System.out.println(fruit);
// }
// 16.reverse string
// String str="Hello";
// String reversed=new StringBuilder(str).reverse().toString();
// System.out.println(reversed);
// 17.palindrome check
// String str="madam";
// String reversed=new StringBuilder(str).reverse().toString();
// System.out.println(reversed);
// 18.string to char array
// String str="java";
// char[] arr=str.toCharArray();
// for(char c:arr){
// System.out.print(c+" ");
// }
// 19.count vowels
// String str="education";
// int count=0;
// for(char c:str.toCharArray()){
// if("aeiou".indexOf(c)!=-1)
// count++;
// }
// System.out.println("Vowels: "+count);
// 20 .remove vowels
// String str="education";
// System.out.println(str.replaceAll("[aeiou]",""));
// 21.string formatting
//String name="Alice";
//int age=25;
//System.out.println("Name:%s ,Age:%d ",name,age);
//System.out.println(String.format("Name: %s, Age: %d", name,age));

// 22.check empty string
// String str="";
// System.out.println(str.isEmpty());
// 23.join strings
// StringJoiner joiner= new StringJoiner(",");
// joiner.add("apple").add("banana").add("cherry");
// System.out.println(joiner);
// 24.Compare using compareTO
//System.out.println("apple".compareTo("banana"));
// 25.remove special characters
// String str = "he@llo#wo$rld";
// System.out.println(str.replaceAll("[^a-zA-Z]", ""));
// 26.count words
// String str="Java is awesome";
// String[] words=str.trim().split("\\s+");
// System.out.println("word count: "+words.length);
// 27.String intern
// String s1=new String("java");
// String s2=s1.intern();
// String s3="java";
// System.out.println(s2==s3);
// 28.StringBuilder Append
// StringBuilder sb=new StringBuilder("Hello");
// sb.append("World");
// System.out.println(sb.toString());
// 29.reverse words in a sentence
// String str="Java is run";
// String[] words=str.split(" ");
// String result="";
// for(int i=words.length-1;i>=0;i--)
// 30.swap two string without temp
// String a="hello";
// String b="wo$rld";
// a=a+b;
// b=a.substring(0,a.length()-b.length());
// a=a.substring(b.length());
// sop(
// 31.remove duplicate  characters
// String str="programming";
// String result="";
// for(char c:str.toCharArray()){
// if(result.indexOf(c)==-1)
// result += c;
// }
// System.out.println(result);
// 32.count occurences of a character
// String str="banan";
// char target='a';
// int count=0;
// for(char c:str.toCharArray()){

}
}