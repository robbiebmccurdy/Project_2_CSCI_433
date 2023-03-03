/*
Assignment: Programming Assignment #2
Course: CSCI 433
Professor: Yixin Chen
Name: Robert McCurdy
Brief Description:
This class is where all of our sort methods are stored. In this class you can find the insertion sort, selection sort, bubble sort, merge sort,
and quick sort.
*/

public class Sorts {

    void InsertionSort(int[] A) {
        int n = A.length;

        for (int i = 1; i < n; i++) {
            int val = A[i];
            int position = i;

            while (position > 1 && A[position - 1] > val) {
                A[position] = A[position - 1];
                position = position - 1;
            }
            A[position] = val;
        }
    }

    void SelectionSort(int[] A) {
        int n = A.length;

        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(A[j] < A[min]){
                    min = j;
                }
            }
            if(A[min] != A[i]){
                int temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
    }

    void BubbleSort(int[] A) {
        boolean swapped = true;
        int n = A.length;

        while (swapped) {
            swapped = false;
            for (int i = 2; i < n; i++) {
                if (A[i - 1] > A[i]) {
                    int temp = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        }
    }

    //MergeSort

    int[] MergeSort(int[] A){
        int n = A.length;
        if (n < 2) {
            return A;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = A[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = A[i];
        }

        MergeSort(l);
        MergeSort(r);

        return Merge(A, l, r);
    }

    int[] Merge(int[] a, int[] l, int[] r){
        int left = l.length;
        int right = r.length;
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }

    void QuickSort(int[] A, int low, int high) {
        if (low < high) {
            int p = Partition(A, low, high);
            QuickSort(A, low, p - 1);
            QuickSort(A, p + 1, high);
        }
    }

    int Partition(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, high);
        return i + 1;
    }

    void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
