public class Prosedur {

    public static void main(String[] args) {
        makan("Nasi Goreng");
        Prosedur cek = new Prosedur();
        cek.minum("Susu");
    }
    static void makan(String makanan){
        System.out.println("Kita sedang Memakan " + makanan);
    }
    void minum(String minuman){
        System.out.println("Kita Sedang Minum " + minuman);
    }
}