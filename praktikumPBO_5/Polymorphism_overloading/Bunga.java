public class Bunga {
    String nama;

    public Bunga(String nama) {
        this.nama = nama;
    }
    public void tumbuh() {
        System.out.println(nama + " sedang tumbuh.");
    }

    public void tumbuh(int hari) {
        System.out.println(nama + " tumbuh setelah " + hari + " hari.");
    }
}