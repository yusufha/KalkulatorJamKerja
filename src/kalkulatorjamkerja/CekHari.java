package kalkulatorjamkerja;

import java.util.Calendar;

/**
 *
 * @author YusufHA
 */
public class CekHari {

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
        return count;
    }
    
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
        return count;
    }
    
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
        return count;
    }
}
