package uashaikalpbo1;

public class Pesawat {
    // atribut dan enkapsulasi
    private String nama;
    private String tujuan;

    // constructor
    public Pesawat(String nama, String tujuan) {
        this.nama = nama;
        this.tujuan = tujuan;
    }

    // mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    // accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getTujuan() {
        return tujuan;
    }

    // Method untuk menampilkan info dasar
    public String displayInfo() {
        return "Nama: " + getNama() + "\nTujuan: " + getTujuan();
    }

    // Overload method displayInfo dengan banyakPenumpang
    public String displayInfo(int banyakPenumpang) {
        return displayInfo() + "\nBanyak Penumpang: " + banyakPenumpang;
    }
}
