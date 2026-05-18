package question_1;

import java.util.Arrays;

class Heap {
    private int size;
    private int arr[];

    public Heap(int arr[]) {
        this.arr = arr;
        this.size = arr.length;
    }

    public void heapify() {
        for (int i = (size / 2) - 1; i >= 0; i--) {

            int pi = i;

            while (true) {

                int left = (2 * pi) + 1;
                int right = (2 * pi) + 2;
                int largest = pi;

                if (left < size && arr[left] > arr[largest]) {
                    largest = left;
                }

                if (right < size && arr[right] > arr[largest]) {
                    largest = right;
                }

                if (largest == pi) {
                    break;
                }

                int temp = arr[pi];
                arr[pi] = arr[largest];
                arr[largest] = temp;

                pi = largest;
            }
        }
    }

    public int deleteMax() {

        if (size == 0)
            return -1;

        int max = arr[0];

        arr[0] = arr[size - 1];
        size--;

        int pi = 0;

        while (true) {

            int left = (2 * pi) + 1;
            int right = (2 * pi) + 2;
            int largest = pi;

            if (left < size && arr[left] > arr[largest]) {
                largest = left;
            }

            if (right < size && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest == pi) {
                break;
            }

            int temp = arr[pi];
            arr[pi] = arr[largest];
            arr[largest] = temp;

            pi = largest;
        }

        return max;
    }
}

public class Q1 {

    public static void main(String[] args) {

        int[] arr = { 9, 4, 3, 8, 10, 2, 5 };

        System.out.println("Before sorting: " + Arrays.toString(arr));

        Heap h = new Heap(arr);

        h.heapify();

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = h.deleteMax();
        }

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}