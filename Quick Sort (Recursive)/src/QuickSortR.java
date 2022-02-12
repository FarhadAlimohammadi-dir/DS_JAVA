import java.util.Scanner;

public class QuickSortR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int prePivot = 0;
        int pivotNumber = 0 ;
        for(int i = 0 ; i < n ; i++)
            arr[i] = input.nextInt();

        quickSort(arr , 0 , arr.length-1);

        for(int i = 0 ; i < arr.length ; i++)
            System.out.print(arr[i]+" ");

    }


    public static void quickSort(int[] arr , int left , int right){

        if(left>=right)
            return;

        int pivot = arr[(left+right)/2];
        int index = part(arr,left,right,pivot);
        quickSort(arr,left,index-1);
        quickSort(arr,index,right);
    }

    public static int part(int[] arr , int left , int right , int pivot){

        while(left<=right) {


            while ((arr[left] < pivot)) {
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            if (left<=right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void swap(int[] arr , int arrIndex1 , int arrIndex2){
        int c = 0 ;
        c = arr[arrIndex1];
        arr[arrIndex1] = arr[arrIndex2];
        arr[arrIndex2] = c;
    }


}
