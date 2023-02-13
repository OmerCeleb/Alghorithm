package BigO;

public class O1 {  // O(1) --- Constant Complexity

    public static void main(String[] args) {

        int[] arr = {10, 2, 20, 40, 55, 7};

        //Arrayin icinde ki son elemani bulunuz
        System.out.println(arr[arr.length - 1]);
        //O(1) --> Direkt yerini belirledigimizden dolayi islem sayisi tek ciycle suruyor.

        //task : verilen bir sayinin cift olup olmama durumu
        int x = 24;
        if (x % 2 == 0) System.out.println("Cift"); //O(1)


    }

}
