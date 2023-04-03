/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mitrovski
 */
public class FizikaTest {
    // Fizika fizika;
    
    public FizikaTest() {
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
     * Test of convertCToF method, of class Fizika.
     */
    @Test
    public void testConvertCToF() {
        System.out.println("convertCToF");
        double C = 0.0;
        Fizika instance = new Fizika();
        instance.convertCToF(C);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        @Test
    public void testConvertCToFRet() {
        System.out.println("convertCToF");
        double C = 32.0;
        Fizika instance = new Fizika();
        instance.convertCToFRet(C);
        
        
    }
    
    
}
