import java.util.Scanner;

public class VotingSystem {

    // Fungsi untuk menampilkan kandidat dan jumlah suara mereka
    public static void displayResults(String[] candidates, int[] votes) {
        System.out.println("\nHasil Voting:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i] + " - " + votes[i] + " suara");
        }
    }

    // Fungsi untuk menambahkan suara ke kandidat tertentu
    public static void voteCandidate(String[] candidates, int[] votes, int candidateNumber) {
        if (candidateNumber >= 1 && candidateNumber <= candidates.length) {
            votes[candidateNumber - 1]++;
            System.out.println("Suara berhasil diberikan untuk " + candidates[candidateNumber - 1] + ".");
        } else {
            System.out.println("Kandidat tidak valid. Silakan coba lagi.");
        }
    }

    // Fungsi untuk menentukan pemenang voting dan menampilkan sertifikat
    public static void determineWinner(String[] candidates, int[] votes) {
        int maxVotes = 0;
        String winner = "";
        boolean tie = false;

        // Menentukan pemenang
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = candidates[i];
                tie = false;
            } else if (votes[i] == maxVotes) {
                tie = true;
            }
        }

        // Jika terjadi seri
        if (tie) {
            System.out.println("\nTidak ada pemenang, hasil voting seri.");
        } else {
            // Menampilkan sertifikat pemenang
            System.out.println("\n==============================================");
            System.out.println("                 SERTIFIKAT PEMENANG          ");
            System.out.println("==============================================");
            System.out.printf("Pemenang: %s\n", winner);
            System.out.printf("Jumlah Suara: %d suara\n", maxVotes);
            System.out.println("==============================================");
        }

        // Menampilkan resume hasil voting
        System.out.println("\nResume Hasil Voting:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("- " + candidates[i] + ": " + votes[i] + " suara");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar kandidat
        String[] candidates = {"Kandidat A", "Kandidat B", "Kandidat C"};
        int[] votes = new int[candidates.length];

        // Menu utama
        int choice;
        do {
            System.out.println("\nSistem Voting");
            System.out.println("1. Lihat Hasil Voting");
            System.out.println("2. Berikan Suara");
            System.out.println("3. Tentukan Pemenang");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayResults(candidates, votes);
                    break;
                case 2:
                    System.out.println("\nDaftar Kandidat:");
                    for (int i = 0; i < candidates.length; i++) {
                        System.out.println((i + 1) + ". " + candidates[i]);
                    }
                    System.out.print("Pilih kandidat (masukkan nomor): ");
                    int candidateNumber = scanner.nextInt();
                    voteCandidate(candidates, votes, candidateNumber);
                    break;
                case 3:
                    determineWinner(candidates, votes);
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        } while (choice != 4);

        scanner.close();
    }
}