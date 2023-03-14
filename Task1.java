//Реализовать алгоритм сортировки слиянием

//package DZ3_JAVA_Collections;
public class Task1 {

    public static void main(String[] args) {

        int[] array = new int[] { 2, 55, 66, 32, 1, 4, 5, 4, 7, 0, 0, 8, 5, 4, 1, 1, 2, 5, 6, 95, 41, 22 };

        mergeSort(array, array.length);

        int[] arrRes = merge(array, array, array, 0, 0);

        printMergeSort(arrRes);

    }

    public static void printMergeSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static int[] merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
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

}
