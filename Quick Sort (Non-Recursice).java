import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class nFactoreil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        quickSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }



        public static void quickSort(int[] arr) {
            Stack stack = new Stack();
            stack.push(0);
            stack.push(arr.length);

            while (!stack.isEmpty()) {
                int end = (int) stack.pop();
                int start = (int) stack.pop();
                if (end - start < 2) {
                    continue;
                }

                // select random part and pivot

                int p = start + ((end - start) / 2);
                p = part(arr, p, start, end);

                stack.push(p + 1);
                stack.push(end);

                stack.push(start);
                stack.push(p);

            }
        }

        private static int part(int[] arr, int position, int start, int end) {
            int l = start;
            int h = end - 2;
            int pivot = arr[position];
            swap(arr, position, end - 1);

            while (l < h) {
                if (arr[l] < pivot) {
                    l++;
                } else if (arr[h] >= pivot) {
                    h--;
                } else {
                    swap(arr, l, h);
                }
            }


            int idx = h;
            if (arr[h] < pivot) {
                idx++;
            }
            swap(arr, end - 1, idx);
            return idx;
        }


        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }


