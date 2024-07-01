package uashaikalpbo1;

import java.util.Scanner;

// inheritance
public class PesawatData extends Pesawat {
    private int banyakPenumpang;
    private String tipe;

    // Constructor
    public PesawatData(String nama, String tujuan) {
        super(nama, tujuan);
    }

    // Setter untuk banyakPenumpang
    public void setBanyakPenumpang(int banyakPenumpang) {
        this.banyakPenumpang = banyakPenumpang;
    }

    // Getter untuk banyakPenumpang
    public int getBanyakPenumpang() {
        return banyakPenumpang;
    }

    // Setter untuk tipe
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Getter untuk tipe
    public String getTipe() {
        return tipe;
    }

    // Overload method displayInfo dengan tipe
    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nBanyak Penumpang: " + banyakPenumpang + "\nTipe: " + tipe;
    }

    // Method untuk input data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        // Input Nama Pesawat
        System.out.print("Masukkan Nama Pesawat\t\t: ");
        setNama(scanner.nextLine());

        // Input Tujuan Pesawat
        System.out.print("Masukkan Tujuan Pesawat\t\t: ");
        setTujuan(scanner.nextLine());

        // Input Banyak Penumpang
        System.out.print("Masukkan Banyak Penumpang\t: ");
        setBanyakPenumpang(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        // Input Tipe Pesawat
        System.out.print("Masukkan Tipe Pesawat\t\t: ");
        setTipe(scanner.nextLine());
    }
}
