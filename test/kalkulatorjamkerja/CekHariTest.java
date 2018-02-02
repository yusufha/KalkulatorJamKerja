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
public class CekHariTest {
    
    public CekHariTest() {
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
     * Test of count method, of class CekHari.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        int year = 2018;
        int month = 2;
        CekHari instance = new CekHari();
        int expResult = 128;
        int result = instance.count(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCount2() {
        System.out.println("count");
        int year = 2018;
        int month = 3;
        CekHari instance = new CekHari();
        int expResult = 142;
        int result = instance.count(year, month);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCount3() {
        System.out.println("count");
        int year = 2018;
        int month = 12;
        CekHari instance = new CekHari();
        int expResult = 137;
        int result = instance.count(year, month);
        assertEquals(expResult, result);
    }
}
