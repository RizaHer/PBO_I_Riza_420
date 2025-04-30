package Modul4Perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " telah meminjam buku: " + judul);
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " telah mengembalikan buku: " + judul);
    }
}