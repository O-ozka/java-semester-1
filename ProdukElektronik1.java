import java.util.Scanner;

public class ProdukElektronik1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk nama produk dan harga
        String[] namaProduk = {"Projector", "Microwave", "Handphone", "Dispenser", "Hairdryer"};
        int[] hargaProduk = {6_600_000, 1_800_000, 5_800_000, 2_000_000, 1_500_000};
        int[] jumlahProduk = new int[5]; // Array untuk menyimpan jumlah setiap produk
       
        // Variabel nama Customer
        String customer;

        // Variabel perulangan
        String belanjaLagi = "Ya";
        int totalBelanja = 0;

        System.err.println("Selamat Datang di Toko Elektronik");
        System.out.print("Masukan nama Anda : ");
        customer = input.nextLine();
        System.out.println("Halo " + customer + " Mau Belanja apa hari ini? ");

        // Perulangan
        while (belanjaLagi.equalsIgnoreCase("Ya")) {
            // Menampilkan daftar produk
            for (int i = 0; i < namaProduk.length; i++) {
                System.out.println("No. " + (i+1) + " " + namaProduk[i] + " (Rp. " + hargaProduk[i] + ")");
            }
            System.out.print("Silahkan Pilih masukan nomor dari 1 sampai 5 yang ingin " + customer + " beli : ");

            int pilihan = input.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dibeli: ");
            int jumlah = input.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                jumlahProduk[pilihan-1] += jumlah;
                totalBelanja += jumlah * hargaProduk[pilihan-1];
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.println("Total Harga sementara: Rp. " + totalBelanja);
            System.out.print("Apakah ingin belanja lagi? (Ya/Tidak): ");
            belanjaLagi = input.next();
        }

        // Menghitung total item yang dibeli
        int totalItem = 0;
        for (int jumlah : jumlahProduk) {
            totalItem += jumlah;
        }

        // Diskon berdasarkan jumlah item yang dibeli
        double diskon = 0;
        if (totalItem > 4 && totalItem <= 5) {
            diskon = 0.2; // Diskon 20%
        } else if (totalItem > 5 && totalItem <= 6) {
            diskon = 0.3; // Diskon 30%
        } else if (totalItem >= 7) {
            diskon = 0.5; // Diskon 50%
        }

        // Menghitung diskon
        double totalSetelahDiskon = totalBelanja - (totalBelanja * diskon);

        // Cetak Struk Belanja
        System.out.println("\n============ Struk Belanja ============");
        System.out.println("Customer: " + customer);
        
        // Menampilkan item yang dibeli
        for (int i = 0; i < namaProduk.length; i++) {
            if (jumlahProduk[i] > 0) {
                System.out.println(namaProduk[i] + " (" + jumlahProduk[i] + " unit)        : Rp. " + 
                                 (jumlahProduk[i] * hargaProduk[i]));
            }
        }

        // Tampilkan Total Belanja
        System.out.println("Total Item Dibeli: " + totalItem);
        System.out.println("-----------------------------");
        System.out.println("Total Belanja             : Rp. " + totalBelanja);
        System.out.println("Total Harga Sebelum Diskon: Rp. " + totalBelanja);
        if (diskon > 0) {
            System.out.println("Diskon (" + (int)(diskon * 100) + "%)              : Rp. " + (totalBelanja * diskon));
        } else {
            System.out.println("Diskon              : Tidak Ada");
        }
        System.out.println("Total Harga Setelah Diskon: Rp. " + (int)totalSetelahDiskon);
        System.out.println("Terima Kasih!");
        input.close();
    }
}