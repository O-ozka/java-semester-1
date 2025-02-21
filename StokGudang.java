public class StokGudang {
    public static void main(String[] args) {
    //Daftar stock gudang
    String[] namaPerangkat = {"Router", "WAREX", "ORION", "Ruiji", "BDCOM", "Cisco"};
    int[] stokPerangkat = {85, 72, 90, 29, 30, 16};

    System.out.println("Hasil Cek Stok Gudang:");

    //Menggunakan for loop untuk memeriksa nilai setiap perangkat
    for (int i = 0; i <namaPerangkat.length; i++) {
        //menggunakan if else untuk menentukan status stok perangkat
        if (stokPerangkat[i] >= 50) {
            System.out.println(namaPerangkat[i] + " - Stok: " + stokPerangkat[i] + " - Tersedia");
        } else {
            System.out.println(namaPerangkat[i] + " - Stok: " + stokPerangkat[i] + " - Hampir Habis");
        }
    }
    }    
}