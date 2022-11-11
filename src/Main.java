class BubbleSort {

    BubbleSort (int arr[]) {
        bubbleSortArray(arr);
    }

    //вывод исходного массива
    void outputArray (int arr[]) {
        String outArray = "Исходный массив: ";
        for (int x = 0; x<arr.length; x++) {
            outArray += arr[x] + " ";
        }
        System.out.println(outArray);
    }

    //сортировка массива пузырьком
    void bubbleSortArray(int arr[]) {
        outputArray(arr);
        for (int x = 0; x < arr.length; x++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        outputSortedArray(arr);
    }

    //вывод отсортированного массива
    void outputSortedArray(int arr[]) {
        String sortArray = "Отсортированный массив: ";
        for (int x = 0; x<arr.length; x++) {
            sortArray += arr[x] + " ";
        }
        System.out.println(sortArray);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] s = {443,4, 535, 3, 5, 67, 78, 1, 0, 525, 552525267, 737};
        BubbleSort array = new BubbleSort(s);
    }
}