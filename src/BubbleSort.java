import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {

        int[] numbers = { 4, 1, 3, 9, 7};
        int size = numbers.length;
        bubbleSort(numbers, size);
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int size1 = numbers1.length;
        bubbleSort(numbers1, size1);
        System.out.println(Arrays.toString(numbers1));
    }

    public static void bubbleSort(int[] numbers, int size) {
        for (int i = 0; i < size - 1; i++) {
            int currentMinimumIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (numbers[j] < numbers[currentMinimumIndex]) {
                    currentMinimumIndex = j;
                }
            }
            swap(numbers, i, currentMinimumIndex);
        }
    }

    public static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexTwo];
        array[indexTwo] = array[indexOne];
        array[indexOne] = temp;
    }
}
