import java.util.Arrays;

public class Arr1{
    public static void main(String[] args){
    //     int[] arr={7,3,9,5};
    //     int min=arr[0];
    //     for(int  num:arr) if(num<min) min=num;
    //     System.out.println(min);
   // int i,j,t=0;
    // int[] a=new int[5];
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the 5 elements to the array");
    // for(i=0;i<5;i++){
    //     a[i]=sc.nextInt();
        // }
    // int[] arr={1,2,3,4,5};
    // int index=Arrays.binarySearch(arr,4);
    // System.out.println(index);
    int[] arr={1,2,3,7,8,9};
    for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
    if(arr[i]+arr[j]==10)
    System.out.println(arr[i]+"+"+arr[j]+"=10");
    }
    }
    }
}