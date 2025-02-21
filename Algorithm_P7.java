import java.util.Scanner;
public class Algorithm_P7 {

    public static void main(String[] args) {
        // Nama Barang / Variabel
        int mie = 2_500;
        int minyak = 5_000;
        int beras = 30_000;
        int gula = 5_000;
        int garam = 5_000;
        String statusBerulang = "Ya";
        int pilihanBarang = 0;
        int totalHarga = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Di Toko Kelontong Belga, mau beli apa hari ini?");
        
        while (statusBerulang.equals("Ya")) {
            System.out.println("No 1. Mie");
            System.out.println("No 2. Minyak");
            System.out.println("No 3. Beras");
            System.out.println("no 4. gula");
            System.out.println("no 5. garam");
            System.out.println("Barang mana yang ingin dibeli?");

            pilihanBarang = input.nextInt();
            if (pilihanBarang == 1) {
                totalHarga = totalHarga + mie;
            }
            else if (pilihanBarang == 2){
                totalHarga = totalHarga + minyak;
            }
            else if (pilihanBarang == 3){
                totalHarga = totalHarga + beras;
            }
            else if (pilihanBarang == 4){
                totalHarga = totalHarga + gula;
            }
            else if (pilihanBarang == 5){
                totalHarga = totalHarga + garam;
            }
            
            System.out.println("apakah ingin beli lagi?(Ya/Tidak)");
            statusBerulang = input.next();
            System.out.println("Total Harga : " + "Rp. "+ totalHarga);
            System.out.println("Terima Kasih");
        }
        input.close();
    }
}