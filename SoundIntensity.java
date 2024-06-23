
import java.util.Scanner;

public class SoundIntensity {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan daya (W): ");
        double power = scanner.nextDouble();
        System.out.print("Masukkan luas area (m^2): ");
        double area = scanner.nextDouble();
        
        double intensity = power / area;
        System.out.println("Intensitas bunyi: " + intensity + " W/m^2");
    }
}
