package Abstraction_interface;

class Anjing implements Hewan, Peliharaan {
    @Override
    public void suara() {
        System.out.println("Anjing menggonggong: Guk! Guk!");
    }

    @Override
    public void namaPemilik(String nama) {
        System.out.println("Anjing ini milik " + nama);
    }

    public void jagaRumah() {
        System.out.println("Anjing menjaga rumah dengan muka garangnya.");
    }
}