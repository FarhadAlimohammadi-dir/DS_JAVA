import java.util.Scanner;

public class MergeSortR {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] notMerger = new int[n];
        for(int i = 0 ; i < n ; i++)
            notMerger[i] = input.nextInt();
        mergeSort(notMerger,notMerger.length);
        for(int i = 0 ; i < notMerger.length ; i++)
            System.out.print(notMerger[i]+" ");

    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = 0;
        if(a.length%2==0)
            mid = n/2;
        else
            mid = (n/2)+1;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            rightArr[i - mid] = a[i];
        }
        mergeSort(leftArr, mid);
        mergeSort(rightArr, n - mid);

        process(a, leftArr, rightArr, mid, n - mid);


    }

    public static void process(
            int[] a, int[] leftArr, int[] rightArr, int leftLenght, int rightLenght) {

        int i = 0, j = 0, k = 0;
        while (i < leftLenght && j < rightLenght) {
            if (leftArr[i] <= rightArr[j]) {
                a[k++] = leftArr[i++];
            }
            else {
                a[k++] = rightArr[j++];
            }
        }
        while (i < leftLenght) {
            a[k++] = leftArr[i++];
        }
        while (j < rightLenght) {
            a[k++] = rightArr[j++];
        }
    }


}
