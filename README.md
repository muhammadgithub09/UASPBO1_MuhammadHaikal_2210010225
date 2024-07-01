# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pesawat`, `PesawarData`, dan `PesawatTerbang` adalah contoh dari class.

```bash
public class Pesawat {
    ...
}

public class pesawatdata extends Pesawat {
    ...
}

public class PesawatTerbang {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Pesawat pesawat = new Pesawat("Lion","Jakarta");` adalah contoh pembuatan object.

```bash
Pesawat pesawat = new Pesawat("Lion","Jakarta");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `tujuan` adalah contoh atribut.

```bash
private String nama;
private String tujuan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pesawat` dan `PesawatTerbang`.

```bash
public Pesawat(String nama, String tujuan) {
        this.nama = nama;
        this.tujuan = tujuan;
}

 public PesawatData(String nama, String tujuan) {
        super(nama, tujuan);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setTujuan` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, dan `getTujuan` adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
}

 public String getTujuan() {
        return tujuan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String nama;
 private String tujuan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class PesawatData extends Pesawat {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
    public String displayInfo() {
        return "Nama: " + getNama() + "\nTujuan: " + getTujuan();
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
public String displayInfo() {
        return super.displayInfo() + "\nBanyak Penumpang: " + banyakPenumpang + "\nTipe: " + tipe;
```

11. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pesawat\t\t: ");
        setNama(scanner.nextLine());


public String displayInfo() {
        return super.displayInfo() + "\nBanyak Penumpang: " + banyakPenumpang + "\nTipe: " + tipe;
public String displayInfo(int banyakPenumpang) {
        return displayInfo() + "\nBanyak Penumpang: " + banyakPenumpang;
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
| 11  | IO Sederhana   |   10    |
|     | **TOTAL**      | **65** |

## Pembuat

Nama: Muhammad Haikal
NPM: 2210010225
