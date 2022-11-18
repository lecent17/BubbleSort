//необходимые пакеты
import java.util.Scanner;

class BubbleSort {

    //необходимые переменные
    private int[] sourceArray;
    private int[] sortArray;


    //конструктор класса
    BubbleSort (int UserArray[]) {
        sourceArray = UserArray;
        bubbleSortArray(this);
    }


    //сортировка массива пузырьком
    void bubbleSortArray(BubbleSort obj) {
        obj.sortArray = obj.sourceArray;
        outputArray(this);
        for (int step = 0; step < obj.sortArray.length; step++) {
            for (int index = 0; index < obj.sortArray.length-1; index++) {
                if (obj.sortArray[index] > obj.sortArray[index + 1]) {
                    int temp = obj.sortArray[index + 1];
                    obj.sortArray[index + 1] = obj.sortArray[index];
                    obj.sortArray[index] = temp;
                }
            }
        }
        outputSortedArray(this);
    }


    //вывод исходного массива
    void outputArray (BubbleSort obj) {
        System.out.println("\nИсходный массив: ");
        for (int ArrayElement : obj.sortArray) System.out.print(ArrayElement + " ");
    }


    //вывод отсортированного массива
    void outputSortedArray(BubbleSort obj) {
        System.out.println("\nОтсортированный массив: ");
        for (int ArrayElement : obj.sortArray) System.out.print(ArrayElement + " ");
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