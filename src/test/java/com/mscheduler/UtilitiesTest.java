/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler;

import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcell
 */
public class UtilitiesTest {
    
    public UtilitiesTest() {
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
     * Test of getPage method, of class Utilities.
     */
    @Test
    public void testGetPage() {
        System.out.println("getPage");
        String str = "";
        int page = 0;
        String expResult = "";
        String result = Utilities.getPage(str, page);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countMaxPage method, of class Utilities.
     */
    @Test
    public void testCountMaxPage() {
        System.out.println("countMaxPage");
        String str = "";
        int expResult = 0;
        int result = Utilities.countMaxPage(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validDateRange method, of class Utilities.
     */
    @Test
    public void testValidDateRange() {
        System.out.println("validDateRange");
        String date = "";
        boolean expResult = false;
        boolean result = Utilities.validDateRange(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDateTimeString method, of class Utilities.
     */
    @Test
    public void testIsValidDateTimeString_String() {
        System.out.println("isValidDateTimeString");
        String date = "";
        boolean expResult = false;
        boolean result = Utilities.isValidDateTimeString(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDateTimeString method, of class Utilities.
     */
    @Test
    public void testIsValidDateTimeString_String_DateTimeFormatter() {
        System.out.println("isValidDateTimeString");
        String date = "";
        DateTimeFormatter format = null;
        boolean expResult = false;
        boolean result = Utilities.isValidDateTimeString(date, format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidDate method, of class Utilities.
     */
    @Test
    public void testIsValidDate() {
        System.out.println("isValidDate");
        String date = "";
        boolean expResult = false;
        boolean result = Utilities.isValidDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidEmail method, of class Utilities.
     */
    @Test
    public void testIsValidEmail() {
        System.out.println("isValidEmail");
        String email = "";
        boolean expResult = false;
        boolean result = Utilities.isValidEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDateRange method, of class Utilities.
     */
    @Test
    public void testCheckDateRange() {
        System.out.println("checkDateRange");
        String dt1 = "";
        String dt2 = "";
        boolean expResult = false;
        boolean result = Utilities.checkDateRange(dt1, dt2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDateAfterToday method, of class Utilities.
     */
    @Test
    public void testIsDateAfterToday() {
        System.out.println("isDateAfterToday");
        String dt1 = "";
        boolean expResult = false;
        boolean result = Utilities.isDateAfterToday(dt1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
