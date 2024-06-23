

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan Bunyi");
            System.out.println("2. Hitung Intensitas Bunyi");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> SpeedOfSound.calculate();
                case 2 -> SoundIntensity.calculate();
                case 3 -> {
                    System.out.println("Keluar");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }
}
