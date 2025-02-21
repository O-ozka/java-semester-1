public class PemilihandanPengulangan {
    public static void main(String[] args) {
    int nilai = 80; //Pengulangan Multi
    if (nilai == 80) {
        System.out.println(nilai == 80);
        System.out.println(nilai);
    }else {
        System.out.println(nilai == 81);
        System.out.println(nilai);

    }
    System.out.println(nilai);
    int day = 1; //pengulangan single
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Kode yang anda masukan tidak valid");
    }    
    for(int i = 0; i < 10; i++){                //(int i = 0;(inisialisasi) i < 10;(kondisi) i++(output)) (++)increment (--)decrement PRINT DATA BERULANG KALI
        System.out.println("Hello " +i);
    }
}
    
}