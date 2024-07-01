package uashaikalpbo1;

public class PesawatTerbang {
        public static void main(String[] args) {
        //objek
        //Pesawat pesawat = new Pesawat("Lion","Jakarta");
        
        //System.out.println("Nama\t\t: " + pesawat.getNama() + " \nTujuan\t\t: " + pesawat.getTujuan());
        //System.out.println(pesawat.displayInfo(150));
        

        PesawatData pesawatData = new PesawatData("Lion", "Jakarta");

        // Input data
        pesawatData.inputData();

        // Display the information
        System.out.println(pesawatData.displayInfo());
    }
}


