import java.util.Scanner;

class BubbleSort {

    BubbleSort (int arr[]) {
        bubbleSortArray(arr);
    }

    //вывод исходного массива
    void outputArray (int arr[]) {
        String outArray = "Исходный массив: ";
        for (int x = 0; x < arr.length; x++) {
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
        for (int x = 0; x < arr.length; x++) {
            sortArray += arr[x] + " ";
        }
        System.out.println(sortArray);
    }
}

public class Main {
    public static void main(String[] args) {
        BubbleSort array1 = new BubbleSort(requestUserData());
    }

    static int[] requestUserData() {
        Scanner requestData = new Scanner(System.in);
        int amountElements, numbers;

        //запрос размера массива и выделение памяти под него
        do {
            System.out.println("Сколько чисел вы хотите добавить в массив?");
            amountElements = requestData.nextInt();
        } while (amountElements <= 0);
        int[] array = new int[amountElements];

        //заполнение массива пользовательскими значениями
        System.out.println("Поочередно введите числа которые должны попасть в массив: ");
        for (int x = 0; x < amountElements; x++) {
            numbers = requestData.nextInt();
            array[x] = numbers;
        }

        return array;
    }
}