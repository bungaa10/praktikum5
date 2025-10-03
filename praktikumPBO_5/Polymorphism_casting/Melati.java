package Polymorphism_casting;
public class Melati extends Bunga {
    public boolean malamHari;
    
    public Melati(String nama, String warna, boolean malamHari) {
        super(nama, warna);
        this.malamHari = malamHari;
    }
    
    @Override
    public void tampilkanBunga() {
        System.out.println("Ini adalah bunga Melati dengan warna " + warna + (malamHari ? " dan mekar di malam hari." : " dan mekar di siang hari."));
    }
    
    @Override
    public void harum() {
        System.out.println("Melati memiliki harum yang khas dan biasa digunakan dalam upacara adat.");
    }
    
    // Method khusus untuk Melati
    public void tampilkanWaktuMekar() {
        System.out.println("Melati mekar pada waktu: " + (malamHari ? "Malam Hari" : "Siang Hari"));
    }
}