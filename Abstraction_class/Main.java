package Abstraction_class;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota") {
    @Override
    public void nyalakanMesin() {
    System.out.println("Mesin mobil Toyota dinyalakan.");
    }

    @Override
    public void berjalan() {
    System.out.println("Mobil Toyota berjalan.");
    }
    };
    Kendaraan motor = new Motor("Honda");

    mobil.nyalakanMesin();
    mobil.berjalan();

    motor.nyalakanMesin();
    motor.berjalan();
    }
}
