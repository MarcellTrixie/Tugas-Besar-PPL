/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler;

import com.mscheduler.view.View;
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
public class ViewMapTest {
    
    public ViewMapTest() {
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
     * Test of getTrigger method, of class ViewMap.
     */
    @Test
    public void testGetTrigger() {
        System.out.println("getTrigger");
        ViewMap instance = null;
        String expResult = "";
        String result = instance.getTrigger();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrigger method, of class ViewMap.
     */
    @Test
    public void testSetTrigger() {
        System.out.println("setTrigger");
        String trigger = "";
        ViewMap instance = null;
        instance.setTrigger(trigger);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class ViewMap.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        ViewMap instance = null;
        View expResult = null;
        View result = instance.getView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setView method, of class ViewMap.
     */
    @Test
    public void testSetView() {
        System.out.println("setView");
        View view = null;
        ViewMap instance = null;
        instance.setView(view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
