package InsertionSort;


public class InsertionSort {

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) { // i 1 den basliyor

            int temp = arr[i]; // tempe 4 atiyorum
            int j = i - 1; // 0. indexe geciyorum

            while (j >= 0 && arr[j] > temp) { // eger j 4 den buyukse while icine giriyorum

                arr[j + 1] = arr[j]; // j birinci indexe ataniyor
                j = j - 1; // 0 . index

            }
            arr[j + 1] = temp; // j = -1 di + 1 ile j sifirinca index oluyor ve temp sifirinci index e ataniyor. ...
        }

    }
}