package Polymorphism_casting;

public class Mawar extends Bunga {
    private int jumlahDuri;
    
    public Mawar(String nama, String warna, int jumlahDuri) {
        super(nama, warna);
        this.jumlahDuri = jumlahDuri;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah bunga Mawar dengan warna " + warna + 
                          " dan memiliki " + jumlahDuri + " duri.");
    }
    
    @Override
    public void harum() {
        System.out.println("Mawar memiliki harum yang manis dan romantis.");
    }
    
    // Method khusus untuk Mawar
    public void tampilkanDuri() {
        System.out.println("Jumlah duri pada mawar: " + jumlahDuri);
    }
}