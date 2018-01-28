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
        int y = 2018, m = 0, d = 3;
        int yy = 2018, mm = 0;
        int jlh_hari;
        
        Calendar cal = Calendar.getInstance();
        cal.set(y, m, d);
        //cal.set(yy, mm);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);
        
//        int week = cal.get(Calendar.HOUR);
//        System.out.println(week);

        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(maxDay);
        
        int mon = cal.get(Calendar.FRIDAY);
        System.out.println(mon);
        
        int tanggal = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input bulan (0-11): ");
        int bulan = scan.nextInt();
        System.out.print("Input tahun: ");
        int tahun = scan.nextInt();
        
        Calendar kalender = Calendar.getInstance();
        kalender.set(tanggal, bulan, tahun);

    }

}
