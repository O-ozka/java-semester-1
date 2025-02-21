import java.util.Scanner;

class KondisidanUlang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jam;

        System.out.print("Jam berapa sekarang? ");
        jam = sc.nextInt();

        if (jam >= 0 && jam < 5 ) {
            System.out.println("Sekarang Jam " + jam + " Selamat Malam");
        }else if (jam >= 5 && jam < 12) {
            System.out.println("Sekarang Jam " + jam + " Selamat Pagi");
        }else if (jam >= 12 && jam < 16) {
            System.err.println("Sekarang jam " + jam + " Selamat Siang");
        }else if (jam >= 16 && jam < 18) {
            System.out.println("Sekarang jam " + jam + " Selamat Sore");
        }else if (jam >= 18 && jam < 24) {
            System.out.println("Sekarang jam " + jam + " Selamat Malam, selamat beristirahat");
        }else if (jam > 24 ) {
            System.out.println("Hah? Jam berapa itu?!");
        } else {
            System.out.println("Mohon Masukan Jam dengan benar");
        }
        

    }
}
