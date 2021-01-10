/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trill
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int no1 = 0;
        int no2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(no1, no2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class Calculator.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int no1 = 0;
        int no2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.substract(no1, no2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int no1 = 0;
        int no2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.divide(no1, no2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int no1 = 0;
        int no2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(no1, no2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
