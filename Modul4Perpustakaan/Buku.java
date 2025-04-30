package Modul4Perpustakaan;

public abstract class Buku {
    public String judul;
    protected String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public abstract void displayInfo();
}
