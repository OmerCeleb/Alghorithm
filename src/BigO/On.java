package BigO;


//Elimizdeki veri seti arttikca calistirilma sureside dogru orantili olarak artiyor.
public class On { // O(n)  ---- > Linear Complexity

    public static void main(String[] args) {


        int[] arr = {10, 2, 20, 40, 55, 7};

        //Toplam 6 islem oluyor hepsini teker teker yazdiriyorum, sure de dogru orantili bir sekilde
        // fazla oluyor. O(6)

        for (int item : arr) {
            System.out.println(item + ", ");
        }
    }
}