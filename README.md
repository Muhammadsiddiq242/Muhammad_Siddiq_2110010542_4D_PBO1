# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `LuasBangun`, `LuasBangunBeraksi`, `LuasLingkaran`, `LuasPersegiPanjang`, dan `LuasSegitiga` adalah contoh dari class.

```bash
public class LuasBangun {
    ...
}

public class LuasLingkaran extends LuasBangun {
    ...
}

public class LuasPersegiPanjang extends LuasBangun {
    ...
}

public class LuasSegitiga extends LuasBangun {
    ...
}

public class LuasBangunBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Scanner scanner = new Scanner(System.in);` adalah contoh pembuatan object.

```bash
Scanner scanner = new Scanner(System.in);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `alas`, `tinggi`, `panjang`, `lebar`, `radius` dan `pengguna` adalah contoh atribut.

```bash
double alas;
double tinggi;
double panjang;
double lebar;
double radius;
Pengguna pengguna;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `LuasBangun` dan `LuasBangunBeraksi`.

```bash
 public Pengguna(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }

   public LuasBangun() {
        this.alas = 0;
        this.tinggi = 0;
        this.panjang = 0;
        this.lebar = 0;
        this.radius = 0;
        this.pengguna = null;
    }

    public LuasBangunBeraksi(LuasBangun.Pengguna pengguna) {
        this.jumlahBangun = 3;
        this.hasilLuas = new double[jumlahBangun];
        this.count = 0;
        this.ulang = true;
        this.pengguna = pengguna;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setUmur`, `setAlas`, `setTinggi`, `setPanjang`, `setLebar`, dan `setRadius` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setUmur(int umur) {
        this.umur = umur;
    }

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

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getUmur`, `getAlas`, `getTinggi`, `getPanjang`, `getLebar`, dan `getRadius` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getUmur() {
    return umur;
}

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

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `alas`, `tinggi`, `panjang`, `lebar`, `radius` dan `pengguna` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private double alas;
private double tinggi;
private double panjang;
private double lebar;
private double radius;
private Pengguna pengguna;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `LuasLingkaran`, `LuasPersegiPanjang`, dan `LuasSegitiga` mewarisi `Luasbangun` dengan sintaks `extends`.

```bash
public class LuasLingkaran extends LuasBangun{
    ...
}

public class LuasPersegiPanjang extends LuasBangun{
    ...
}

public class LuasSegitiga extends LuasBangun{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, penggunaan objek inner class `Pengguna` dan  method `hitungLuasSegitiga()`, `hitungLuasPersegiPanjnag` dan `hitungLuasLingkaran()`.

```bash


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

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `hitungLuasBangun`.

```bash
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

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan `while` untuk meminta input dan menampilkan data.

```bash
while (ulang) {
    //.
}

int umur = 0;
while (umur <= 0) {
   //.
}


```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan nama pengguna: ");
String nama = scanner.nextLine();

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

System.out.println("\nHalo, " + pengguna.getNama() + " (" + pengguna.getUmur() + " tahun)");

System.out.println("Pilih bangun untuk menghitung luas:");
System.out.println("1. Segitiga");
System.out.println("2. Persegi Panjang");
System.out.println("3. Lingkaran");

System.out.println("Luas segitiga: " + luasSegitigaResult);
System.out.println("Luas persegi panjang: " + luasPersegiPanjangResult);
System.out.println("Luas lingkaran: " + luasLingkaranResult);

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

System.out.println("Array sudah terisi. Perhitungan selesai.");


```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` LuasBangun luasBangun = new LuasBangun();` adalah contoh penggunaan array.

```bash
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

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
 try {
                pilihan = scanner.nextInt();
} catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine(); // Membersihkan input yang salah
                continue; // Melanjutkan ke iterasi berikutnya
 }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Siddiq
NPM: 2110010542
