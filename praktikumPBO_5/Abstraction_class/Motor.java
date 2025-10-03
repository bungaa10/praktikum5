package Abstraction_class;

public class Motor extends Kendaraan{
    public Motor(String nama) {
        super(nama);
    }

    @Override
    void berjalan() {
        System.out.println(nama + " melaju di jalur motor.");
    }
}
