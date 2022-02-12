import java.util.Arrays;
import java.util.Scanner;

public class mergeSortNR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        mergeSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void mergeSort(int[] arr){

        if(arr.length<2)
            return;

        int counter = 1;

        int leftStart , rightStart;

        while(counter < arr.length){

            leftStart = 0;
            rightStart = counter;

            while(rightStart + counter <= arr.length) {

                mergeArray(arr, leftStart, leftStart + counter, rightStart, rightStart + counter);
                leftStart = rightStart + counter;
                rightStart = leftStart + counter;

            }

            if(rightStart < arr.length){

                mergeArray(arr,leftStart,leftStart+counter,rightStart,arr.length);
            }

            counter*=2;

        }

    }


    public static void mergeArray(int[]arr , int leftStart ,int leftStop , int rightStart , int rightStop){

        int[] right = new int[rightStop - rightStart +1];
        int[] left = new int [leftStop - leftStart +1];

        for(int i = 0 , k = rightStart ; i<(right.length-1);i++,k++){

            right[i]=arr[k];
        }

        for(int i = 0 , k = leftStart ; i<(left.length-1);i++,k++){

            left[i]=arr[k];
        }

        // set Max int for secend one

        right[right.length-1] = Integer.MAX_VALUE;
        left[left.length-1] = Integer.MAX_VALUE;

        for(int k = leftStart , m = 0  , n = 0;k<rightStop;k++){

            if(left[m] <= right[n]){
                arr[k] = left[m++];
            }

            else {
                arr[k] = right[n++];
            }

        }

    }
}

