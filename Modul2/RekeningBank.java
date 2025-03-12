package Modul2;

class Rekening {
    String nomorRekening;
    String namaPemilik;
    Double saldo;

    public Rekening(String nomorRekening, String namaPemilik, Double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Saldo : " + saldo);
        System.out.println();
    }

    void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor : " + jumlah);
        System.out.println("Saldo sekarang : " + saldo);
        System.out.println();
    }

    void tarikUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik : " + jumlah);
            System.out.println("Saldo sekarang : " + saldo);
            System.out.println();
        } else {
            System.out.println("Saldo tidak cukup untuk menarik uang sebesar : " + jumlah);
            System.out.println();
        }
    }
}

public class RekeningBank {
    public static void main(String[] args) {
        Rekening bank1 = new Rekening("202010370311420", "Riza", 300000.0);
        Rekening bank2 = new Rekening("202010370311024", "Rija", 400000.0);

        bank1.tampilkanInfo();
        bank2.tampilkanInfo();

        bank1.setorUang(50000);
        bank2.setorUang(100000);

        bank1.tarikUang(200000);
        bank2.tarikUang(500000);
    }
}
