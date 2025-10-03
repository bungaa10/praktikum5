package Abstraction_interface;

public class MainInterface {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        hewan1.suara();
        ((Peliharaan) hewan1).namaPemilik("Budi"); 
        ((Kucing) hewan1).cakar(); 

        System.out.println("-------------------");
        Hewan h2 = new Anjing();
        h2.suara();
        ((Peliharaan) h2).namaPemilik("Sinta"); 
        ((Anjing) h2).jagaRumah(); 
    }
}
