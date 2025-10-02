package Abstraction_interface;


public class Kucing implements Hewan, Peliharaan {

    @Override
    public void suara() {
        System.out.println("Kucing mengeong: Meong!");
    }

    @Override
    public void namaPemilik(String nama) {
        System.out.println("Kucing ini milik " + nama);
    }

    // Method khusus Kucing
    public void cakar() {
        System.out.println("Kucing mencakar dengan kukunya.");
    }
}
