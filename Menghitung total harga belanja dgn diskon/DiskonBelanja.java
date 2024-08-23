import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Dekorasi awal
        System.out.println("====================================");
        System.out.println("      Program Diskon Belanja        ");
        System.out.println("====================================\n");
        
        // Meminta input harga awal barang
        System.out.print("Masukkan harga awal barang (Rp): ");
        double hargaAwal = scanner.nextDouble();
        
        // Meminta input persentase diskon
        System.out.print("Masukkan persentase diskon (contoh: 20 untuk 20%): ");
        double persentaseDiskon = scanner.nextDouble();
        
        // Meminta input jumlah barang yang dibeli
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();
        
        // Menghitung harga setelah diskon
        double diskon = (persentaseDiskon / 100) * hargaAwal;
        double hargaSetelahDiskon = hargaAwal - diskon;
        
        // Menghitung total harga untuk semua barang yang dibeli
        double totalHarga = hargaSetelahDiskon * jumlahBarang;
        
        // Dekorasi hasil
        System.out.println("\n====================================");
        System.out.println("          Rincian Pembelian         ");
        System.out.println("====================================");
        System.out.printf("Harga awal barang     : Rp %.2f\n", hargaAwal);
        System.out.printf("Diskon                : Rp %.2f (%.2f%%)\n", diskon, persentaseDiskon);
        System.out.printf("Harga setelah diskon  : Rp %.2f\n", hargaSetelahDiskon);
        System.out.printf("Jumlah barang         : %d\n", jumlahBarang);
        System.out.println("------------------------------------");
        System.out.printf("Total harga setelah diskon: Rp %.2f\n", totalHarga);
        System.out.println("====================================\n");
        
        // Menutup Scanner
        scanner.close();
    }
}
