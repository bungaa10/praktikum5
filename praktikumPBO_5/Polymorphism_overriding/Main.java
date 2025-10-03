package Polymorphism_overriding;

public class Main {
    public static void main(String[] args) {
        Bunga umum = new Bunga("Bunga Umum");
        umum.bermekaran();

        Bunga mawar = new Mawar("Mawar");
        mawar.bermekaran();

        Bunga melati = new Melati("Melati");
        melati.bermekaran();
    }
}
