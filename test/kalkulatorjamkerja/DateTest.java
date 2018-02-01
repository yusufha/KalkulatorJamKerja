package kalkulatorjamkerja;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YusufHA
 */
public class DateTest {
    
    public DateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validasiTahun method, of class Date.
     */
    @Test
    public void testValidasiTahun() throws Exception {
        System.out.println("Validasi Tahun [Benar]");
        int thn = 1992;
        Date instance = new Date();
        boolean result = instance.validasiTahun(thn);
        assertTrue(result);
    }

    /**
     * Test of validasiBulan method, of class Date.
     */
    @Test
    public void testValidasiBulan() throws Exception {
        System.out.println("Validasi Bulan [Benar]");
        int bln = 5;
        Date instance = new Date();
        boolean result = instance.validasiBulan(bln);
        assertTrue(result);   
    }
}
