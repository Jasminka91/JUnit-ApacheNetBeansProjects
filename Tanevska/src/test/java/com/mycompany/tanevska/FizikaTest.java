/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tanevska;

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
    @org.junit.Test
    public void testConvertCToF() {
        System.out.println("convertCToF");
        double C = 0.0;
        Fizika instance = new Fizika();
        instance.convertCToF(C);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
	public void prodazba(){
		Matematika objGK = new Matematika();
		int expected= 6;
		int got =objGK.pPravoagolnikRet(2, 3);//6
	
		assertEquals(expected,got);
	}
    
    
    
    
    
}
