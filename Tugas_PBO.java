import java.util.Scanner;

class Admin {
    private String username = "admin420";
    private String password = "password420";

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Mahasiswa {
    private String nama = "Riza";
    private String nim = "202010370311420";

    public boolean login(String nama, String nim) {
        return this.nama.equals(nama) && this.nim.equals(nim);
    }

    public void identitas() {
        System.out.println("nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

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

        if (choice == 1) {
            System.out.print("Masukkan username: ");
            username = objInput.nextLine();
            System.out.print("Masukkan password: ");
            password = objInput.nextLine();

            Admin admin = new Admin();
            if (admin.login(username, password)) {
                System.out.println("Login admin berhasil!");
            }
            else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        }
        else if (choice == 2) {
            System.out.print("Masukkan Nama: ");
            nama = objInput.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = objInput.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa();
            if (mahasiswa.login(nama, nim)) {
                System.out.println("Login Mahasiswa berhasil!");
                mahasiswa.identitas();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}