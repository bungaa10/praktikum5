package Polymorphism_casting;
public class MainPolymorphismCasting {
    public static void main(String[] args) {
        
        Hewan hewan1 = new Kucing("Kitty");
        Hewan hewan2 = new Anjing("Dugong");

        hewan1.bersuara();
        hewan2.bersuara();

        Hewan hewan = new Kucing("Oyen");
        hewan.bersuara();

        if (hewan instanceof Kucing) {
            Kucing k = (Kucing) hewan;
            k.cakar(); 
        }
        Hewan hewan3 = new Anjing("Buddy");
        if (hewan3 instanceof Anjing) {
            Anjing a = (Anjing) hewan3;
            a.jagaRumah(); 
        }
    }
}

