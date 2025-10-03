package Polymorphism_casting;

public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " menggonggong: Guk! Guk!");
    }
    void jagaRumah() {
        System.out.println(nama + " menjaga rumah dengan muka garangnya.");
    }
}
