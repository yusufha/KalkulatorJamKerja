/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorjamkerja;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WINDOWS 10
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
     * Test of countSSRK method, of class CekHari.
     */
    @Test
    public void testCountSSRK() {
        System.out.println("countSSRK Benar Feb");
        int year = 2018;
        int month = 2;
        CekHari instance = new CekHari();
        int expResult = 96;
        int result = instance.countSSRK(year, month);
        assertEquals(expResult, result);
        
        System.out.println("countSSRK Benar Jan");
        int year1 = 2018;
        int month1 = 1;
        CekHari instance1 = new CekHari();
        int expResult1 = 114;
        int result1 = instance1.countSSRK(year, month);
        assertEquals(expResult, result);
    }

    /**
     * Test of countJumat method, of class CekHari.
     */
    @Test
    public void testCountJumat() {
        System.out.println("countJumat Feb");
        int year = 2018;
        int month = 2;
        CekHari instance = new CekHari();
        int expResult = 20;
        int result = instance.countJumat(year, month);
        assertEquals(expResult, result);
        
        System.out.println("countJumat Jan");
        int year1 = 2018;
        int month1 = 1;
        CekHari instance1 = new CekHari();
        int expResult1 = 20;
        int result1 = instance1.countJumat(year, month);
        assertEquals(expResult, result);
    }

    /**
     * Test of countSabtu method, of class CekHari.
     */
    @Test
    public void testCountSabtu() {
        System.out.println("countSabtu Feb");
        int year = 2018;
        int month = 2;
        CekHari instance = new CekHari();
        int expResult = 12;
        int result = instance.countSabtu(year, month);
        assertEquals(expResult, result);
        
        System.out.println("countSabtu Jan");
        int year1 = 2018;
        int month1 = 2;
        CekHari instance1 = new CekHari();
        int expResult1 = 12;
        int result1 = instance1.countSabtu(year, month);
        assertEquals(expResult, result);
    }
    
}
