package Hitung;

public class MatematikaBeraksi {
    //membuat objek
    public static void main(String[] args) {
        Matematika fahmi = new Matematika(3,5);

        System.out.println("Hasil Penjumlahan = " + fahmi.setPenjumlahan());
        System.out.println("Hasil Pengurangan = " + fahmi.setPengurangan());
        System.out.println("Hasil Perkalian = " + fahmi.setPerkalian());
        System.out.println("Hasil Pembagian = " + fahmi.setPembagian());
    }
}
