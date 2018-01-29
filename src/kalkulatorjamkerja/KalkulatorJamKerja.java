package kalkulatorjamkerja;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author YusufHA
 */
public class KalkulatorJamKerja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input tahun : ");
            int yy = scan.nextInt();
            System.out.print("Input bulan : ");
            int mm = scan.nextInt();

            CekHari jumlah_hari_kerja = new CekHari();
            int jhk_SSRK = jumlah_hari_kerja.countSSRK(yy, mm);
            int jhk_J = jumlah_hari_kerja.countJumat(yy, mm);
            int jhk_S = jumlah_hari_kerja.countSabtu(yy, mm);

            int jumlah_hk = jhk_SSRK + jhk_J + jhk_S;
            System.out.println("Jumlah Hari Kerja pada bulan " + mm + " adalah " + jumlah_hk + " hari.");

            HitungJamKerja hjk = new HitungJamKerja();
            System.out.println("Jumlah Jam Kerja pada bulan " + mm + " adalah " + hjk.JumlahJamKerja() + " jam.");
        }
    }
}
