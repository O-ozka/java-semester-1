import java.util.Scanner;

class KonversiSuhu {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Konversi Celcius ke Fahreint");
        System.out.println("2. Konversi Fahreint ke Celcius");
        System.out.println("Masukan Pilihan 1 atau 2: ");
        int pilihan = sc.nextInt();

    if (pilihan == 1) {
        System.out.print("kalo gitu masukan suhu celcius dong: ");
        double Celcius = sc.nextDouble();
        double Fahreneit = (Celcius * 9 / 5 ) + 32;
        System.out.printf("Suhunya jadi " + Fahreneit + " Fahreneit. Tadi sudah aku hitung loh");
    } else if (pilihan == 2) {
        System.out.print("kalo gitu masukan suhu fahreint dong: ");
        double Fahreneit = sc.nextDouble();
        double Celcius = (Fahreneit - 32) * 5 / 9;
        System.out.print("Suhunya jadi " + Celcius + " Celcius. Tadi sudah aku hitung loh");
    }
    }
}