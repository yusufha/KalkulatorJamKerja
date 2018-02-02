package kalkulatorjamkerja;
import java.util.Calendar;

/**
 * Class Cek Hari dalam sebulan.
 * Memiliki method yang berfungsi sebagai penghitung hari dan jam kerja selama sebulan.
 * @author YusufHA
 */
public class CekHari {

    /**
     * Menghitung jumlah hari (senin, selasa, rabu, kamis, jumat, sabtu) selama sebulan.
     * Lalu jumlah hari (senin, selasa, rabu, kamis, jumat,  sabtu) dikali jumlah jam kerja masing2 hari.
     * @param year type: int | berisi inputan tahun
     * @param month type: int | berisi inputan bulan
     * @return Total jam kerja selama sebulan
     */
    public int count(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int countSSRK = 0, countJ = 0, countS = 0, countTotal = 0;
        for (int day = 1; day <= daysInMonth; day++) {
            calendar.set(year, month - 1, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if ((dayOfWeek == Calendar.MONDAY) || (dayOfWeek == Calendar.TUESDAY) ||
               (dayOfWeek == Calendar.WEDNESDAY) || (dayOfWeek == Calendar.THURSDAY)){
                countSSRK++;
            }
            if (dayOfWeek == Calendar.FRIDAY){
                countJ++;
            }
            if (dayOfWeek == Calendar.SATURDAY){
                countS++;
            }
        }
        countTotal = (countSSRK * Settings.JamKerjaSSRK) + (countJ * Settings.JamKerjaJ) + (countS * Settings.JamKerjaS);
        return countTotal;
    }
}
    
//    /**
//     * Method penghitung jumlah hari (jumat) dalam satu bulan.
//     * Lalu jumlah hari (jumat) dikali jumlah jam kerja.
//     * @param year type: int | berisi inputan tahun
//     * @param month type: int | berisi inputan bulan
//     * @return  akan mengel
//     */
//    public int countJumat(int year, int month){
//        calendar.set(year, month - 1, 1);
//        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//        
//        int count = 0;
//        for (int day = 1; day <= daysInMonth; day++){
//            calendar.set(year, month - 1, day);
//            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//            
//        }
//        return count * Settings.JamKerjaJ;
//    }
//    
//    /**
//     * Method penghitung jumlah hari (sabtu) dalam satu bulan.
//     * Lalu jumlah hari (sabtu) dikali jumlah jam kerja. 
//     * @param year type: int | berisi inputan tahun
//     * @param month type: int | berisi inputan bulan
//     * @return 
//     */
//    public int countSabtu(int year, int month){
//        calendar.set(year, month - 1, 1);
//        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//        
//        int count = 0;
//        for (int day = 1; day <= daysInMonth; day++){
//            calendar.set(year, month - 1, day);
//            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//        }
//        return count * Settings.JamKerjaS;
//    }