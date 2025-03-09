package Modul1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        String nama;
        String nim;
        String username;
        String password;
        Scanner objInput = new Scanner(System.in);

        System.out.println("--- Sistem Login ---");
        System.out.println("Pilih login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int choice = objInput.nextInt();
        objInput.nextLine();

        if (choice == 1) {
            System.out.print("Masukkan username: ");
            username = objInput.nextLine();
            System.out.print("Masukkan password: ");
            password = objInput.nextLine();

            if (username.equals("admin420") & password.equals("password420")) {
                System.out.println("Login admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        }
        else if (choice == 2) {
            System.out.print("Masukkan Nama: ");
            nama = objInput.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = objInput.nextLine();

            if (nama.equals("Riza Her") & nim.equals("202010370311420")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}