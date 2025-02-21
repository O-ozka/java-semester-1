import java.util.Scanner;

public class ContohPemilihanPerulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Struktur Pemilihan (if-else)
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah bilangan genap.");
        } else {
            System.out.println("Angka " + angka + " adalah bilangan ganjil.");
        }

        // Struktur Perulangan (for)
        System.out.print("Masukkan batas atas angka: ");
        int batasAtas = scanner.nextInt();

        int jumlahGanjil = 0;
        for (int i = 1; i <= batasAtas; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }

        System.out.println("Jumlah bilangan ganjil dari 1 hingga " + batasAtas + " adalah: " + jumlahGanjil);

        // Struktur Perulangan (while)
        int hitung = 1;
        System.out.println("Angka ganjil dari 1 hingga " + batasAtas + ":");
        while (hitung <= batasAtas) {
            if (hitung % 2 != 0) {
                System.out.print(hitung + " ");
            }
            hitung++;
        }
    }
}
