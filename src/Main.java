public class Main {
    public static void main(String[] args) {
        int[] arr = {443,4, 535, 3, 5, 67, 78, 1, 0, 525, 552525267, 737};

        System.out.println("Исходный массив: ");
        for (int x = 0; x<arr.length; x++) {
            System.out.print(arr[x] + " ");
        }

        for (int x = 1; x < arr.length; x++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\n\nОтсортированный массив: ");
        for (int x = 0; x<arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}