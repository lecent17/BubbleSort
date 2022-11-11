class BubbleSort {

    //необходимые переменные
    long[] arr = {443,4, 535, 3, 5, 67, 78, 1, 0, 525, 552525267, 737};

    //вывод исходного массива
    void outputArray () {
        String outArray = "Исходный массив: ";
        for (int x = 0; x<arr.length; x++) {
            outArray += arr[x] + " ";
        }
        System.out.println(outArray);
    }

    //сортировка массива пузырьком
    void bubbleSortArray() {
        outputArray();
        for (int x = 0; x < arr.length; x++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    long temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        outputSortedArray();
    }

    //вывод отсортированного массива
    void outputSortedArray() {
        String sortArray = "Отсортированный массив: ";
        for (int x = 0; x<arr.length; x++) {
            sortArray += arr[x] + " ";
        }
        System.out.println(sortArray);
    }
}

public class Main {
    public static void main(String[] args) {
        BubbleSort array = new BubbleSort();
        array.bubbleSortArray();
    }
}