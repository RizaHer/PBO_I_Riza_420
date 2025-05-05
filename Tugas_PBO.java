import java.util.Scanner;

public class Tugas_PBO {
    public static void main(String[] args) {
        String username, password, nama, nim;
        Scanner objInput = new Scanner(System.in);

        System.out.println("--- Sistem Login ---");
        System.out.println("Pilih login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int choice = objInput.nextInt();
        objInput.nextLine();

        System.out.print("Masukkan Nama: ");
        nama = objInput.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = objInput.nextLine();

        if (choice == 1) {
            System.out.print("Masukkan username: ");
            username = objInput.nextLine();
            System.out.print("Masukkan password: ");
            password = objInput.nextLine();

            Admin admin = new Admin(nama, nim);
            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (choice == 2) {
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}