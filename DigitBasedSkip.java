import java.util.Scanner;
public class DigitBasedSkip{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++){
		String str=String.valueOf(i);
 		if (str.contains("3") || str.contains("5")) {
		continue;
		}else{
			System.out.print(" "+i);
			sum+=i;//sum=sum+i;
	}
	System.out.println(" sum: "+sum);
	}
}
}
