import java.util.Scanner;

public class ProdukElektronik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variabel namaProduk dan hargaProduk
        int projector = 6_600_000;
        int microwave = 1_800_000;
        int handphone = 5_800_000;
        int dispenser = 2_000_000;
        int hairdryer = 1_500_000;
       
        //Variabel nama Customer
        String customer;

        //Variabel perulangan
        String belanjaLagi = "Ya";
        int totalBelanja = 0;

        //Variabel menghitung jumlah item
        int jumlah = 0;
        int jumlahProjector = 0, jumlahMicrowave = 0, jumlahHandphone = 0, jumlahDispenser = 0, jumlahHairdryer = 0;

        System.err.println("Selamat Datang di Toko Elektronik");
        System.out.print("Masukan nama Anda : ");
        customer = input.nextLine();
        System.out.println("Halo " + customer + " Mau Belanja apa hari ini? ");

        //Perulangan
        while (belanjaLagi.equalsIgnoreCase("Ya")) {
            System.out.println("No. 1 Projector (Rp. 6.000.000)");
            System.out.println("No. 2 Microwave (Rp. 1.800.000)");
            System.out.println("No. 3 Handphone (Rp. 5.800.000)");
            System.out.println("No. 4 Dispenser (Rp. 2.000.000)");
            System.out.println("No. 5 Hairdryer (Rp. 1.500.000)");
            System.out.print("Silahkan Pilih masukan nomor dari 1 sampai 5 yang ingin " + customer + " beli : ");

            int pilihan = input.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dibeli: ");
            jumlah = input.nextInt();

            switch (pilihan) {
                case 1:
                jumlahProjector += jumlah;
                totalBelanja += jumlah * projector;
                break;
                case 2:
                jumlahMicrowave += jumlah;
                totalBelanja += jumlah * microwave;
                break;
                case 3:
                jumlahHandphone += jumlah;
                totalBelanja += jumlah * handphone;
                break;
                case 4:
                jumlahDispenser += jumlah;
                totalBelanja += jumlah * dispenser;
                break;
                case 5:
                jumlahHairdryer += jumlah;
                totalBelanja += jumlah * hairdryer;
                break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println("Total Harga sementara: Rp. " + totalBelanja);
            System.out.print("Apakah ingin belanja lagi? (Ya/Tidak): ");
            belanjaLagi = input.next();
        }
        //Menghitung total item yang dibeli
        int totalItem = jumlahProjector + jumlahMicrowave + jumlahHandphone + jumlahDispenser + jumlahHairdryer;

        //Diskon berdasarkan jumlah item yang dibeli
        double diskon = 0;
        if (totalItem > 4 && totalItem <= 5) {
            diskon = 0.2; // Diskon 20%
        } else if (totalItem > 5 && totalItem <= 6) {
            diskon = 0.3; // Diskon 30%
        } else if (totalItem >= 7) {
            diskon = 0.5; // Diskon 50%
        }
        //menghitung diskon
        double totalSetelahDiskon = totalBelanja - (totalBelanja * diskon);

        // Cetak Struk Belanja
        System.out.println("\n============ Struk Belanja ============");
        System.out.println("Customer: " + customer);
        if (jumlahProjector > 0) {
            System.out.println("Projector (" + jumlahProjector + " unit)        : Rp. " + (jumlahProjector * projector));
        }
        if (jumlahMicrowave > 0) {
            System.out.println("Microwave (" + jumlahMicrowave + " unit)        : Rp. " + (jumlahMicrowave * microwave));
        }
        if (jumlahHandphone > 0) {
            System.out.println("Handphone (" + jumlahHandphone + " unit)        : Rp. " + (jumlahHandphone * handphone));
        }
        if (jumlahDispenser > 0) {
            System.out.println("Dispenser (" + jumlahDispenser + " unit)        : Rp. " + (jumlahDispenser * dispenser));
        }
        if (jumlahHairdryer > 0) {
            System.out.println("Hairdryer (" + jumlahHairdryer + " unit)        : Rp. " + (jumlahHairdryer * hairdryer));
        }

        // Tampilkan Total Belanja
        System.out.println("Total Item Dibeli: " + totalItem);
        System.out.println("-----------------------------");
        System.out.println("Total Belanja             : Rp. " + totalBelanja);
        System.out.println("Total Harga Sebelum Diskon: Rp. " + totalBelanja);
        if (diskon > 0) {
            System.out.println("Diskon (" + (int)(diskon * 100) + "%)              : Rp. " + (totalBelanja * diskon));
        } else {
            System.out.println("Diskon              : Tidak Ada");
        }
        System.out.println("Total Harga Setelah Diskon: Rp. " + (int)totalSetelahDiskon);
        System.out.println("Terima Kasih!");
        input.close();
    }
}