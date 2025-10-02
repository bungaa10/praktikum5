package Polymorphism_casting;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println(nama + " mengeong: Meong!");
    }
    void cakar() {
        System.out.println(nama + " mencakar dengan kukunya.");
    }
}

