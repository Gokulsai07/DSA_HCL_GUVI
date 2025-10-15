public class CountVowels{
	public static void main(String[] args){
		String str="Hello Java Loop Programs";
		int count=0;
		for(int i=0;i<str.length();i++){
		char ch=Character.toLowerCase(str.charAt(i));
		if("aeiou".indexOf(ch)!=-1){
		count++;
		}
	}
	System.out.println("vowels count="+count);
}
}