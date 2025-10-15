import java.io.*;
import java.util.*;
public class MatrixAddition{
	public static void main(String[] args){
		int m,n,p,q,i,j;
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		Scanner sc=new Scanner(system.in);
		System.out.println("Enter the dimension of A matrix: ");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("Enter the dimension of B matrix: ");
		p=sc.nextInt();
		q=sc.nextInt();
		System.out.println("Enter the dimension of A matrix: ");
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				b[i][j]=sc.nextInt();
		System.out.println("Addition");	
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				c[i][j]=a[i][j]+b[i][j];
		System.out.println("Addition Result");
		for(i=0;i<p;i++){
			System.out.println();
			for(j=0;j<q;j++)
				System.out.print(c[i][j]+" ");
		}
	}
}
			