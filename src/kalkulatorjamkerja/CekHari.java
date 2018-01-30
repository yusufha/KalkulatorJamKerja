package kalkulatorjamkerja;

import java.util.Calendar;

/**
 * Class Cek Hari dalam sebulan.
 * Terdiri dari method cek hari senin-kamis, method cek hari jumat, dan cek hari sabtu.
 * @author YusufHA
 */
public class CekHari {

    /**
     * Method penghitung jumlah hari (senin, selasa, rabu, kamis) dalam satu bulan.
     * Lalu jumlah hari (senin, selasa, rabu, kamis) dikali jumlah jam kerja.
     * @param year type: int | berisi inputan tahun
     * @param month type: int | berisi inputan bulan
     * @return 
     */
    public int countSSRK(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (int day = 1; day <= daysInMonth; day++) {
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.MONDAY) {
                count++;
            }
            if (dayOfWeek == Calendar.TUESDAY) {
                count++;
            }
            if (dayOfWeek == Calendar.WEDNESDAY) {
                count++;
            }
            if (dayOfWeek == Calendar.THURSDAY) {
                count++;
            }
        }
        return count *6;
    }
    
    /**
     * Method penghitung jumlah hari (jumat) dalam satu bulan.
     * Lalu jumlah hari (jumat) dikali jumlah jam kerja.
     * @param year type: int | berisi inputan tahun
     * @param month type: int | berisi inputan bulan
     * @return 
     */
    public int countJumat(int year, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        int count = 0;
        for (int day = 1; day <= daysInMonth; day++){
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.FRIDAY){
                count++;
            }
        }
        return count *5;
    }
    
    /**
     * Method penghitung jumlah hari (sabtu) dalam satu bulan.
     * Lalu jumlah hari (sabtu) dikali jumlah jam kerja. 
     * @param year type: int | berisi inputan tahun
     * @param month type: int | berisi inputan bulan
     * @return 
     */
    public int countSabtu(int year, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        int count = 0;
        for (int day = 1; day <= daysInMonth; day++){
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.SATURDAY){
                count++;
            }
        }
        return count *3;
    }
}