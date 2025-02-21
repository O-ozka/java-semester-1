// Heap Sort untuk Integer dan String
import java.util.Arrays;

public class HeapSort {

    // Heap Sort untuk Integer
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Membangun max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Ekstrak elemen satu per satu dari heap
        for (int i = n - 1; i > 0; i--) {
            // Pindahkan root ke akhir
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Panggil heapify pada heap yang tereduksi
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Root terbesar
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Jika anak kiri lebih besar dari root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Jika anak kanan lebih besar dari root
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Jika root bukan yang terbesar
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Rekursif heapify sub-tree
            heapify(arr, n, largest);
        }
    }

    // Heap Sort untuk String
    public static void heapSort(String[] arr) {
        int n = arr.length;

        // Membangun max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Ekstrak elemen satu per satu dari heap
        for (int i = n - 1; i > 0; i--) {
            // Pindahkan root ke akhir
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Panggil heapify pada heap yang tereduksi
            heapify(arr, i, 0);
        }
    }

    private static void heapify(String[] arr, int n, int i) {
        int largest = i; // Root terbesar
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Jika anak kiri lebih besar dari root (berdasarkan urutan leksikografis)
        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }

        // Jika anak kanan lebih besar dari root
        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }

        // Jika root bukan yang terbesar
        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Rekursif heapify sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        // Contoh untuk Integer
        int[] intArr = {12, 11, 13, 5, 6, 7};
        System.out.println("Array Integer sebelum sort: " + Arrays.toString(intArr));
        heapSort(intArr);
        System.out.println("Array Integer setelah sort: " + Arrays.toString(intArr));

        // Contoh untuk String
        String[] stringArr = {"banana", "apple", "cherry", "date"};
        System.out.println("\nArray String sebelum sort: " + Arrays.toString(stringArr));
        heapSort(stringArr);
        System.out.println("Array String setelah sort: " + Arrays.toString(stringArr));
    }
}
