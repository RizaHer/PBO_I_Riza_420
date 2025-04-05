package Modul3;

    class KarakterGame {
        private String nama;
        private int kesehatan;

        public KarakterGame(String nama, int kesehatan) {
            this.nama = nama;
            this.kesehatan = kesehatan;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getKesehatan() {
            return kesehatan;
        }

        public void setKesehatan(int kesehatan) {
            this.kesehatan = kesehatan;
        }

        public void serang(KarakterGame target) {
        }
    }

    class Pahlawan extends KarakterGame {
        public Pahlawan(String nama, int kesehatan) {
            super(nama, kesehatan);
        }

        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
            target.setKesehatan(target.getKesehatan() - 20);
            System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
        }
    }

    class Musuh extends KarakterGame {
        public Musuh(String nama, int kesehatan) {
            super(nama, kesehatan);
        }

        @Override
        public void serang(KarakterGame target) {
            System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
            target.setKesehatan(target.getKesehatan() - 15);
            System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
        }
    }

    public class codelab{
        public static void main(String[] args) {
            Pahlawan brimstone = new Pahlawan("Brimstone", 150);
            Musuh viper = new Musuh("Viper", 200);

            System.out.println("Kesehatan Pahlawan: " + brimstone.getKesehatan());
            System.out.println("Kesehatan Musuh: " + viper.getKesehatan());

            brimstone.serang(viper);
            viper.serang(brimstone);
        }
    }
