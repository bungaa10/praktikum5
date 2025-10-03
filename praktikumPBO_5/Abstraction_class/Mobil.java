package Abstraction_class;

abstract class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama);
    }

    @Override
    void berjalan() {
        System.out.println(nama + " berjalan di jalan raya.");
    }
}
