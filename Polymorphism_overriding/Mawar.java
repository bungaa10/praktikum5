package Polymorphism_overriding;
public class Mawar extends Bunga {
    public Mawar(String nama) {
        super(nama);
    }

    @Override
    void bermekaran() {
        System.out.println(nama + " bermekaran dengan kelopak merah yang cantik.");
    }
}