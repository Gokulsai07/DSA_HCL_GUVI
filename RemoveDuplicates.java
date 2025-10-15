public class RemoveDuplicates{
	public static void main(String[] args){
	int[] arr={1,2,2,3,1};
	Set<Integer> set=new LinkedHashSet<>();
	for(int n:arr) 
	set.add(n);
	System.out.println(set);
	}
}