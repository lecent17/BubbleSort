import java.util.Scanner;

class BubbleSort {

    int[] Array;

    BubbleSort (int UserArray[]) {
        Array = UserArray;
        bubbleSortArray(this);
    }

    //сортировка массива пузырьком
    void bubbleSortArray(BubbleSort element) {
        outputArray(this);
        for (int step = 0; step < element.Array.length; step++) {
            for (int index = 0; index < element.Array.length-1; index++) {
                if (element.Array[index] > element.Array[index + 1]) {
                    int temp = element.Array[index + 1];
                    element.Array[index + 1] = element.Array[index];
                    element.Array[index] = temp;
                }
            }
        }
        outputSortedArray(this);
    }

    //вывод исходного массива
    void outputArray (BubbleSort element) {
        System.out.println("\nИсходный массив: ");
        for (int ArrayElement : element.Array) System.out.print(ArrayElement + " ");
    }

    //вывод отсортированного массива
    void outputSortedArray(BubbleSort element) {
        System.out.println("\nОтсортированный массив: ");
        for (int ArrayElement : element.Array) System.out.print(ArrayElement + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        //создание тестового обьекта
        BubbleSort TestArray = new BubbleSort(requestUserData());
    }

    //запрос пользовательских данных
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