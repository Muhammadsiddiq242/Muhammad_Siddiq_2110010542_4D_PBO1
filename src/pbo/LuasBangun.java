
package pbo;

//class
public class LuasBangun {
   // Encapsulation dan atribut
    private double alas;
    private double tinggi;
    private double panjang;
    private double lebar;
    private double radius;
    private Pengguna pengguna; // Tambahkan objek Pengguna di class LuasBangun

    // Inner class Pengguna
    public class Pengguna {
        private String nama;
        private int umur;

        public Pengguna(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getUmur() {
            return umur;
        }

        public void setUmur(int umur) {
            this.umur = umur;
        }
    }

    // Constructor
    public LuasBangun() {
        this.alas = 0;
        this.tinggi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.radius = 0;
        this.pengguna = null;
    }

    // Mutator
    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Accessor
    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getRadius() {
        return radius;
    }

    // Getter dan Setter untuk objek Pengguna
    public Pengguna getPengguna() {
        return pengguna;
    }

    public void setPengguna(Pengguna pengguna) {
        this.pengguna = pengguna;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuasSegitiga() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung luas persegi panjang
    public double hitungLuasPersegiPanjang() {
        return panjang * lebar;
    }

    // Method untuk menghitung luas lingkaran
    public double hitungLuasLingkaran() {
        return Math.PI * radius * radius;
    }
}