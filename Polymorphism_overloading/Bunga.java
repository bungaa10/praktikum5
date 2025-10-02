class Bunga {
    String nama;

    public Bunga(String nama) {
        this.nama = nama;
    }
    void tumbuh() {
        System.out.println(nama + " sedang tumbuh.");
    }

    void tumbuh(int hari) {
        System.out.println(nama + " tumbuh setelah " + hari + " hari.");
    }
}