

import java.util.Scanner;

public class SpeedOfSound {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan frekuensi (Hz): ");
        double frequency = scanner.nextDouble();
        System.out.print("Masukkan panjang gelombang (m): ");
        double wavelength = scanner.nextDouble();
        
        double speed = frequency * wavelength;
        System.out.println("Kecepatan bunyi: " + speed + " m/s");
    }
}
