import java.util.Scanner;

public class Kelontong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Variabel
        int telur = 16000;
        int beras = 13000;
        int minyak = 17000;
        int galon = 8000;
        int elpiji = 25000;

        //Variabel Perulangan
        String belanjaLagi = "Ya";
        int belanja = 0;
        int totalBelanja = 0;

        System.out.println("Hallo, mau belanja apa hari ini?");

        //perulangan
        while (belanjaLagi.equals("Ya")) {
            System.out.println("No. 1 : Telur. \nNo. 2 : Beras. \nNo. 3 : Minyak. \nNo. 4 : Galon. \nNo. 5 : Elpiji");
            System.out.print("Silahkan Pilih nomor 1 sampai 5 : ");


            belanja = input.nextInt();
            switch (belanja) {
                case 1: totalBelanja += telur; 
                break;
                case 2: totalBelanja += beras; 
                break;
                case 3: totalBelanja += minyak; 
                break;
                case 4: totalBelanja += galon; 
                break;
                case 5: totalBelanja += elpiji; 
                break;
            }
            System.out.println("Total Harga sementara : " + "Rp. "+ totalBelanja);
            System.out.print("Apakah ingin belanja lagi? (Ya/Tidak) ");
            belanjaLagi = input.next();
        }
        double diskon = 0;
        if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.15; // Diskon 15%
        } else if (totalBelanja > 50000) {
            diskon = totalBelanja * 0.10; // Diskon 10%
        }
        double totalAkhir = totalBelanja - diskon;

        // Tampilkan Total dan Promo
        System.out.println("\n====== Struk Belanja ======");
        System.out.println("Total Harga\t: Rp. " + totalBelanja);
        System.out.println("Diskon\t\t: Rp. " + diskon);
        System.out.println("Total Akhir\t: Rp. " + totalAkhir);
        System.out.println("Terima Kasih!");
        
        input.close();
    }
}