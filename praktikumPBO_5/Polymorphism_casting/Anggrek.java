package Polymorphism_casting;

public class Anggrek extends Bunga {
    public String jenisBatang;
    
    public Anggrek(String nama, String warna, String jenisBatang) {
        super(nama, warna);
        this.jenisBatang = jenisBatang;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah bunga Anggrek dengan warna " + warna + 
                          " dan memiliki batang " + jenisBatang + ".");
    }
    
    @Override
    public void harum() {
        System.out.println("Anggrek memiliki harum yang lembut dan elegan.");
    }
    
    public void tampilkanJenisBatang() {
        System.out.println("Jenis batang anggrek: " + jenisBatang);
    }
}