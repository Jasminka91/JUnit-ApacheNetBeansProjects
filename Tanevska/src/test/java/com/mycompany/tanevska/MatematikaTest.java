/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tanevska;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mitrovski
 */
public class MatematikaTest {
    //Autowire
    //Matematika matematika;
    //Matematika objGK = new Matematika();
    //class members
    private int b=3;
    //constrctor
    //methods=TC
    
    
    public MatematikaTest() {
    }


    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of pPravoagolnik method, of class Matematika.
     */
    @org.junit.jupiter.api.Test
    public void testPPravoagolnik() {
        System.out.println("pPravoagolnik");
        int a = 0;
        int b = 0;
        Matematika instance = new Matematika();
        instance.pPravoagolnik(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pKruznica method, of class Matematika.
     */
    @org.junit.jupiter.api.Test
    public void testPKruznica() {
        System.out.println("pKruznica");
        double r = 0.0;
        Matematika instance = new Matematika();
        instance.pKruznica(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pPravoagolnikRet method, of class Matematika.
     */
    @org.junit.jupiter.api.Test
    public void testPPravoagolnikRet() {
        System.out.println("pPravoagolnikRet");
        int a = 0;
        int b = 0;
        Matematika instance = new Matematika();
        int expResult = 0;
        int result = instance.pPravoagolnikRet(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

   @Test
	public void testpPravoagolnikRet(){
                //instance with matematika
                System.out.println("matematika");
		Matematika objGK = new Matematika();
                //expected
		int expected= 6;
		int got =objGK.pPravoagolnikRet(2, this.b);//6
	        //assertation
		assertEquals(expected,got);
	} 
        
    @Test
	public void testpPravoagolnikReturn0(){
                //instance with matematika
                System.out.println("matematika");
		Matematika objGK = new Matematika();
                //expected
		int expected= 0;
		int got =objGK.pPravoagolnikRet(0, this.b);//6
	        //assertation
		assertEquals(expected,got);
	}      
    
        
    @Test
	public void testPKvadratRet(){
                System.out.println("matematika");
		Matematika objGK = new Matematika();
		int expected= 4;
		int got =objGK.pKvadratRet(2);//6
	
		assertEquals(expected,got);
	} 
    
    
    
    
    
}
