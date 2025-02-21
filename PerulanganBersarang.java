import java.util.Scanner;

public class PerulanganBersarang {

    public static void main(String[] args) {
        String status = "ya";
        while (status == "ya"){
            //Nilai Algoritma
            Scanner inputAlgo = new Scanner(System.in);
            int nilaiAlgo;
            System.out.print("Masukan nilai Algo: ");
            nilaiAlgo = inputAlgo.nextInt();

            //Nilai Struktur Data 
            Scanner inputSD = new Scanner(System.in);
            int nilaiSD;
            System.out.print("Masukan nilai Struktur Data: ");
            nilaiSD = inputSD.nextInt();

            //Pengkondisian
            if (nilaiAlgo >= 80 && nilaiSD >= 80) {
                System.out.println("Nilai Algo dan Struktur Data Lulus");
            } else if (nilaiAlgo >= 80 || nilaiSD >= 80){
                System.out.println("Salah satu nilainya tidak lulus");

                //pengkondisian bercabang
                if (nilaiAlgo >= 80) {
                    System.out.println("Nilai Algo Lulus");
                } else if (nilaiSD >= 80) {
                    System.out.println("Nilai SD Lulus");
                } else {
                    
                }
            } else {
                System.out.println("remedial");

            }

            //Mau Lanjut Proses
            Scanner proses = new Scanner(System.in);
            System.out.println("Masih mau cek? ");
            status = proses.nextLine();

        }
    

        
    }
}