public class CommandLineExamples{
	public static void main(String[] args){
		if(args.length<2){
			System.out.println("Please provide two numbers as arguments");
			return;
		}
		// convert string args to integers
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		 int sum=num1+num2;
		 System.out.println("sum of "+num1+" and "+num2+" is: "+sum);
	}
}