package Modul4;

import Modul4Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Fiksi("Harry Potter", "J.K. Rowling");
        Buku buku2 = new NonFiksi("Sapiens", "Yuval Noah Harari");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota anggota1 = new Anggota("Riza", "I420");
        Anggota anggota2 = new Anggota("Rigan", "I280");

        anggota1.pinjamBuku(buku1.judul);
        anggota1.kembalikanBuku(buku1.judul);
        anggota2.pinjamBuku(buku2.judul);
        anggota2.kembalikanBuku(buku2.judul);
    }
}