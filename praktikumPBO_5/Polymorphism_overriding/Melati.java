package Polymorphism_overriding;
public class Melati extends Bunga {
    public Melati(String nama) {
        super(nama);
    }

    @Override
    public void bermekaran() {
        System.out.println(nama + " bermekaran dengan bunga putih yang harum.");
    }
}