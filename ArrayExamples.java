public class ArrayElementSearch{
	public static void main(String[] args){
		int[] arr={5,10,15};
		int key=10;
		int idx=-1;
		boolean found=false;
		for(int i:arr) if(i==key)found =true;
		System.out.println(found?"Found ":"not found");
		for(int i=0;i<arr.length;i++) 
			if(arr[i]==key){
				idx=1;
				break;
		}
		System.out.println("index: "+idx);
	}
}