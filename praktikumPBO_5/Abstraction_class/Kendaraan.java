package Abstraction_class;

abstract class Kendaraan {
    String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }
    void nyalakanMesin() {
        System.out.println(nama + " menyalakan mesin.");
    }
    abstract void berjalan();
}
