package Polymorphism_casting;
public class Bunga {
    public String nama;
    public String warna;
    
    public Bunga(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
    
    public void tampilkanInfo() {
        System.out.println("Ini adalah bunga " + nama + " dengan warna " + warna);
    }
    
    public void harum() {
        System.out.println("Bunga ini memiliki harum khas.");
    }
}