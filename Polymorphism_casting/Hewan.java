package Polymorphism_casting;

public class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    void bersuara() {
        System.out.println(nama + " mengeluarkan suara.");
    }
}
