import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) throws Exception {
        int[] numbers = { 4, 1, 3, 9, 7};
        int size = numbers.length;
        quickSort(numbers, 0, size - 1);
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = { 2, 1, 6, 10, 4, 1, 3, 9, 7};
        int size1 = numbers1.length;
        quickSort(numbers1, 0, size1 - 1);
        System.out.println(Arrays.toString(numbers1));
    }

    public static void quickSort(int[] array, int lowestIndex, int highestIndex) {

        if (lowestIndex < highestIndex) {
            int partitionIndex = partition(array, lowestIndex, highestIndex);
            quickSort(array, lowestIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, highestIndex);
        }
    }

    public static int partition(int[] array, int lowestIndex, int highestIndex) {
        int pivot = array[highestIndex];
        int indexToTheRightOfPivot = lowestIndex - 1;

        for (int j = lowestIndex; j <= highestIndex - 1; j++) {
            if (array[j] < pivot) {
                indexToTheRightOfPivot++;
                swap(array, indexToTheRightOfPivot, j);
            }
        }
        swap(array, indexToTheRightOfPivot + 1, highestIndex);
        return indexToTheRightOfPivot + 1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
