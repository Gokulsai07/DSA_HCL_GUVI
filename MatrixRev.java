public class MatrixRev{
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6}};
            for(int i=0;i<arr.length;i++){
            int start=0,end=arr[i].length-1;
            while(start<end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
            }
            for(int[] row:arr){
                for(int val:row)
                    System.out.print(val+" ");
                System.out.println();
    }
    }
}