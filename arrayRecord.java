import java.util.Arrays;
public class arrayRecord {
    public static void main(String[] args) {
        System.out.println("Contoh Array");
        System.out.print("-> ");
        int[] array_integer = {1, 2, 3, 4};
        
        //Indeks Array ------> 0  1  2  3
        
        //Cetak Komponen Array -> nama_array[indeks]           
        System.out.print(array_integer[0] + ",");
        System.out.print(array_integer[1] + ",");
        System.out.print(array_integer[2] + ",");
        System.out.print(array_integer[3] + "\n");   
        
        System.out.println("");

        System.out.println("-> " + Arrays.toString(array_integer)); //cara cetak array semuanya

        for (int i = 0; i < array_integer.length ; i++) {
            System.out.println("Index " + array_integer[i]);
        }
        
    }
}
