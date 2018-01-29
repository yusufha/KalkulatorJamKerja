package kalkulatorjamkerja;

/**
 *
 * @author YusufHA
 */
public class HitungJamKerja {
    int yy, mm;
  
    CekHari jumlah_hari = new CekHari();
    int SSRK = jumlah_hari.countSSRK(yy, mm);
    int J = jumlah_hari.countJumat(yy, mm);
    int S = jumlah_hari.countSabtu(yy, mm);
    
    public double JumlahJamKerja(){
        double jumlahjamkerja;
        jumlahjamkerja = (SSRK * 6) + (J * 5) + (S * 3);
        return jumlahjamkerja;
    }
}
