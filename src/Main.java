//необходимые пакеты
import java.util.Scanner;

class BubbleSort {

    //необходимые переменные
    private long[] sourceArray;
    private long[] sortArray;


    //конструктор класса
    BubbleSort (long sourceArray[]) {
        this.sourceArray = sourceArray;
        outputSourceArray(this);
        bubbleSortArray(this);
        outputSortedArray(this);
    }


    //сортировка массива пузырьком
    void bubbleSortArray(BubbleSort obj) {
        obj.sortArray = obj.sourceArray;
        for (int step = 0; step < obj.sortArray.length; step++) {
            for (int index = 0; index < obj.sortArray.length-1; index++) {
                if (obj.sortArray[index] > obj.sortArray[index + 1]) {
                    long temp = obj.sortArray[index + 1];
                    obj.sortArray[index + 1] = obj.sortArray[index];
                    obj.sortArray[index] = temp;
                }
            }
        }
    }


    //вывод исходного массива
    void outputSourceArray (BubbleSort obj) {
        System.out.println("\nИсходный массив: ");
        for (long ArrayElement : obj.sortArray) System.out.print(ArrayElement + " ");
    }


    //вывод отсортированного массива
    void outputSortedArray(BubbleSort obj) {
        System.out.println("\nОтсортированный массив: ");
        for (long ArrayElement : obj.sortArray) System.out.print(ArrayElement + " ");
    }
}


public class Main {
    public static void main(String[] args) {
        //создание тестового обьекта
        BubbleSort TestArray = new BubbleSort(requestUserData());
    }

    //запрос пользовательских данных
    static long[] requestUserData() {
        Scanner requestData = new Scanner(System.in);
        int amountElements;
        long numbers;

        //запрос размера массива и выделение памяти под него
        do {
            System.out.println("Сколько чисел вы хотите добавить в массив?");
            amountElements = requestData.nextInt();
        } while (amountElements <= 0);
        long[] array = new long[amountElements];

        //заполнение массива пользовательскими значениями
        System.out.println("Поочередно введите числа которые должны попасть в массив: ");
        for (int x = 0; x < amountElements; x++) {
            numbers = requestData.nextLong();
            array[x] = numbers;
        }

        return array;
    }
}