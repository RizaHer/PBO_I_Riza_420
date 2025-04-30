import java.util.Scanner;

class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean login(String inputNama, String inputNim) {
        return false;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class Admin extends User {
    private String username = "admin420";
    private String password = "password420";

    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
        super.displayInfo();
    }
}

class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return this.getNama().equals(inputNama) && this.getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        super.displayInfo();
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