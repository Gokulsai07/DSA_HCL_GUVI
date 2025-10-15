public class CheckBoard{
public static void main(String[] args){
	int size=6;
	for(int i=1;i<=size;i++){
		for(int j=1;j<=size;j++){
			if((i+j)%2==0){
				System.out.print("X");
			}else{
				System.out.print("O");
			}
		}
		System.out.println();
	}
}
}
