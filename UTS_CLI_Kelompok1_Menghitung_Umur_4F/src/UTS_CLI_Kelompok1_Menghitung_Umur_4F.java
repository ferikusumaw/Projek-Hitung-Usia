
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class UTS_CLI_Kelompok1_Menghitung_Umur_4F {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("===============================================\n");
        System.out.print("===      Menghitung Umur Kelompok 1         ===\n");
        System.out.print("===============================================\n");

        int hari_lahir, bulan_lahir, tahun_lahir;

        do {
            System.out.print("Masukkan tanggal lahir (1-31): ");
            hari_lahir = scanner.nextInt();
        } while (hari_lahir < 1 || hari_lahir > 31);

        do {
            System.out.print("Masukkan bulan lahir (1-12): ");
            bulan_lahir = scanner.nextInt();
        } while (bulan_lahir < 1 || bulan_lahir > 12);

        do {
            System.out.print("Masukkan tahun lahir: ");
            tahun_lahir = scanner.nextInt();
        } while (tahun_lahir < 100); 

        LocalDate tanggal_sekarang = LocalDate.now();
        LocalDate tanggal_lahir = LocalDate.of(tahun_lahir, bulan_lahir, hari_lahir);

        Period age = Period.between(tanggal_lahir, tanggal_sekarang);
        
        int tahun = age.getYears();
        int bulan = age.getMonths();

        System.out.print("\n");
        System.out.print("===============================================\n");

        System.out.println("Umur Anda adalah " + tahun + " tahun " + bulan + " bulan.");
        System.out.print("===============================================\n");
    }
}

