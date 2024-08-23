import java.util.Scanner;
import java.text.DecimalFormat;

public class gaji {
    public static void main(String[] args) throws InterruptedException {

        // Display title with decoration
        System.out.println("===========================================================================================");
        System.out.println("                             *** SELAMAT DATANG DI KALKULATOR GAJI ***");
        System.out.println("===========================================================================================");
        
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input hourly rate
        System.out.println("\nMasukkan nilai tarif per jam. (Angka saja)");
        System.out.print("Tarif per jam: Rp ");
        int tarif = scanner.nextInt();

        // Input hours worked
        System.out.println("Masukkan jumlah jam kerja. (Angka saja)");
        System.out.print("Jumlah jam kerja: ");
        int jam = scanner.nextInt();

        // Calculate salary with 10% deduction
        double gaji = (tarif * jam) - ((tarif * jam) * 10 / 100.0);

        // Output result with delay
        System.out.println("\nMohon tunggu hasil dari nilai yang anda masukkan...");
        Thread.sleep(3000); // Reduced delay for faster feedback

        DecimalFormat df = new DecimalFormat("#,###.00");
        
        // Display result with decoration
        System.out.println("\n================================ HASIL PERHITUNGAN =======================================");
        System.out.println(">> Gaji Bersih Anda setelah potongan 10% adalah: Rp " + df.format(gaji) + " <<");
        System.out.println("===========================================================================================");
        System.out.println("               Terima kasih telah menggunakan Kalkulator Gaji kami!");
        System.out.println("                      Code written by @abiGTGshessh");
        System.out.println("===========================================================================================");
        
        // Close the scanner
        scanner.close();
    }
}
