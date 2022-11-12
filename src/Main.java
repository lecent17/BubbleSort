import java.util.Scanner;

class BubbleSort {

    int[] array;

    BubbleSort (int arr[]) {
        array = arr;
        bubbleSortArray(this);
    }

    //вывод исходного массива
    void outputArray (BubbleSort element) {
        System.out.println("\nИсходный массив: ");
        for (int x : element.array) System.out.print(x + " ");
    }

    //сортировка массива пузырьком
    void bubbleSortArray(BubbleSort element) {
        outputArray(this);
        for (int x = 0; x < element.array.length; x++) {
            for (int j = 0; j < element.array.length-1; j++) {
                if (element.array[j] > element.array[j + 1]) {
                    int temp = element.array[j + 1];
                    element.array[j + 1] = element.array[j];
                    element.array[j] = temp;
                }
            }
        }
        outputSortedArray(this);
    }

    //вывод отсортированного массива
    void outputSortedArray(BubbleSort element) {
        System.out.println("\nОтсортированный массив: ");
        for (int x : element.array) System.out.print(x + " ");
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