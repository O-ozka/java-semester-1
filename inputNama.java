import java.util.Scanner;

class InputNama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fistName, middleName, lastName;
        System.out.print("Masukkan nama depan Anda: ");
        fistName = sc.nextLine();
        System.out.print("Masukkan nama tengah Anda: ");
        middleName = sc.nextLine();
        System.out.print("Masukkan nama belakang Anda: ");
        lastName = sc.nextLine();
        System.out.print("Nama Anda adalah: " + fistName +" " + middleName + " " +lastName);
        
        sc.close(); // Tutup scanner
    }
}
