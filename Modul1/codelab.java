package Modul1;
import java.util.Scanner;
import java.time.LocalDate;

public class codelab {
    public static void main(String[] args) {
        String nama;
        String gender;
        int umur;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        nama = objInput.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        gender = objInput.nextLine().toUpperCase();
        System.out.print("Masukkan umur anda: ");
        umur = objInput.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);

        switch (gender) {
            case "L":
                System.out.println("Jenis kelamin: Laki-laki");
                break;
            case "P":
                System.out.println("Jenis kelamin: Perempuan");
                break;
            default:
                System.out.println("Jenis kelamin tidak diketahui");
        }
    }
}