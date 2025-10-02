package Polymorphism_overriding;
public class Melati extends Bunga {
    public Melati(String nama) {
        super(nama);
    }

    @Override
    void bermekaran() {
        System.out.println(nama + " bermekaran dengan bunga putih yang harum.");
    }
}