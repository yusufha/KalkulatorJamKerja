package kalkulatorjamkerja;

import javax.swing.JOptionPane;

/**
 * Berisi method validasi tahun dan bulan
 * @author YusufHA
 */
public class Date {
    private int bln; // initial bulan
    private int thn; // initial tahun
    
    public Date(int bln, int thn) throws CustomException {
        this.thn = thn;
        this.bln = bln;
    }

    Date() {}
    /**
     * Method validasi tahun
     * Tahun tidak boleh lebih kecil dari 1970 dan lebih besar 9999
     * @param thn
     * @return
     * @throws CustomException 
     */
    public boolean validasiTahun(int thn) throws CustomException {
        if (thn < 1970 || thn > 9999) {
            JOptionPane.showMessageDialog(null, 
                    "Input Tahun Salah");
            throw new CustomException("Input Tahun Salah");
        }
        return true;
    }
    
    /**
     * Method validasi bulan
     * Inputan Bulan harus 1-12
     * @param bln
     * @return
     * @throws CustomException 
     */
    public boolean validasiBulan(int bln) throws CustomException {
        if (bln < 1 || bln > 12) {
            JOptionPane.showMessageDialog(null, 
                    "Input Bulan Salah");
            throw new CustomException("Input Bulan Salah, 1-12");
        }
        return true;
    }
}
