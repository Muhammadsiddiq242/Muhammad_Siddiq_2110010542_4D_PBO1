
package pbo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LuasBangunBeraksi {
    private int jumlahBangun;
    private double[] hasilLuas;
    private int count;
    private boolean ulang;
    private LuasBangun.Pengguna pengguna; 

    // Constructor untuk menerima objek Pengguna dari class LuasBangun
    public LuasBangunBeraksi(LuasBangun.Pengguna pengguna) {
        this.jumlahBangun = 3;
        this.hasilLuas = new double[jumlahBangun];
        this.count = 0;
        this.ulang = true;
        this.pengguna = pengguna;
    }

    // Method untuk memasukkan data pengguna (nama dan umur)object
    private void inputPengguna() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pengguna: ");
        String nama = scanner.nextLine();

        int umur = 0;
        while (umur <= 0) {
            try {
                System.out.print("Masukkan umur pengguna: ");
                umur = scanner.nextInt();
                if (umur <= 0) {
                    System.out.println("Umur harus lebih dari 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }

        pengguna.setNama(nama);
        pengguna.setUmur(umur);
    }

    // Method untuk menghitung luas bangun
    private void hitungLuasBangun() {
        Scanner scanner = new Scanner(System.in);

        // Input data pengguna
        inputPengguna();
        
        //perulangan
        while (ulang) {
            System.out.println("\nHalo, " + pengguna.getNama() + " (" + pengguna.getUmur() + " tahun)");
            System.out.println("Pilih bangun untuk menghitung luas:");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");

            int pilihan = 0;

            // Error handling untuk input huruf selain angka
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine(); // Membersihkan input yang salah
                continue; // Melanjutkan ke iterasi berikutnya
            }
            
            switch (pilihan) {
                case 1:
                    LuasBangun luasSegitiga = new LuasBangun();

                    // Input data segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    luasSegitiga.setAlas(scanner.nextDouble());

                    System.out.print("Masukkan tinggi segitiga: ");
                    luasSegitiga.setTinggi(scanner.nextDouble());

                    double luasSegitigaResult = luasSegitiga.hitungLuasSegitiga();
                    hasilLuas[count] = luasSegitigaResult;
                    count++;
                    System.out.println("Luas segitiga: " + luasSegitigaResult);
                    break;

                case 2:
                    LuasBangun luasPersegiPanjang = new LuasBangun();

                    // Input data persegi panjang
                    System.out.print("Masukkan panjang persegi panjang: ");
                    luasPersegiPanjang.setPanjang(scanner.nextDouble());

                    System.out.print("Masukkan lebar persegi panjang: ");
                    luasPersegiPanjang.setLebar(scanner.nextDouble());

                    double luasPersegiPanjangResult = luasPersegiPanjang.hitungLuasPersegiPanjang();
                    hasilLuas[count] = luasPersegiPanjangResult;
                    count++;
                    System.out.println("Luas persegi panjang: " + luasPersegiPanjangResult);
                    break;

                case 3:
                    LuasBangun luasLingkaran = new LuasBangun();

                    // Input data lingkaran
                    System.out.print("Masukkan radius lingkaran: ");
                    luasLingkaran.setRadius(scanner.nextDouble());

                    double luasLingkaranResult = luasLingkaran.hitungLuasLingkaran();
                    hasilLuas[count] = luasLingkaranResult;
                    count++;
                    System.out.println("Luas lingkaran: " + luasLingkaranResult);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Tanya apakah pengguna ingin mengulang perhitungan
            System.out.print("Apakah Anda ingin mengulang perhitungan? (ya/tidak): ");
            String ulangInput = scanner.next().toLowerCase();

            if (!ulangInput.equals("ya")) {
                ulang = false;
            }

            // Cek apakah array sudah terisi
            if (count == jumlahBangun) {
                System.out.println("\n---------- Koding Array ----------");
                for (int i = 0; i < count; i++) {
                    String namaBangun = "";
                    switch (i) {
                        case 0:
                            namaBangun = "Segitiga";
                            break;
                        case 1:
                            namaBangun = "Persegi Panjang";
                            break;
                        case 2:
                            namaBangun = "Lingkaran";
                            break;
                    }
                    System.out.println(namaBangun + ": " + hasilLuas[i]);
                }
                System.out.println("---------- Koding Array ----------");
                System.out.println("Array sudah terisi. Perhitungan selesai.");
                break;
            }
        }

        System.out.println("Terima kasih, " + pengguna.getNama() + "! (Umur: " + pengguna.getUmur() + " tahun)");
    }

    public static void main(String[] args) {
        LuasBangun luasBangun = new LuasBangun();
        LuasBangun.Pengguna pengguna = luasBangun.new Pengguna("", 0); // Menggunakan objek Pengguna dari class LuasBangun
        LuasBangunBeraksi lb = new LuasBangunBeraksi(pengguna);
        lb.hitungLuasBangun();
    }
}