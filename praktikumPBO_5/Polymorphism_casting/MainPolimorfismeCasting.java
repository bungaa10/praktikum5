package Polymorphism_casting;

public class MainPolimorfismeCasting {
    public static void main(String[] args) {
        
        System.out.println("=== INFORMASI BUNGA : ===");
        Bunga bunga1 = new Mawar("Mawar Merah", "Merah", 15);
        Bunga bunga2 = new Melati("Melati Putih", "Putih", true);
        Bunga bunga3 = new Anggrek("Anggrek Bulan", "Ungu", "Epifit");
        bunga1.tampilkanInfo();
        bunga1.harum();
        bunga2.tampilkanInfo();
        bunga2.harum();
        bunga3.tampilkanInfo();
        bunga3.harum();
        System.out.println("\n=== DOWNCASTING ===");
        
        if (bunga1 instanceof Mawar) {
            Mawar mawar = (Mawar) bunga1;
            mawar.tampilkanDuri(); 
        }
        
        if (bunga2 instanceof Melati) {
            Melati melati = (Melati) bunga2;
            melati.tampilkanWaktuMekar(); 
        }
        
        if (bunga3 instanceof Anggrek) {
            Anggrek anggrek = (Anggrek) bunga3;
            anggrek.tampilkanJenisBatang(); 
        }
    }
}