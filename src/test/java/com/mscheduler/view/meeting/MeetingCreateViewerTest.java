/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.view.meeting;

import java.util.Scanner;
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
public class MeetingCreateViewerTest {
    
    public MeetingCreateViewerTest() {
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
     * Test of getInstance method, of class MeetingCreateViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MeetingCreateViewer expResult = null;
        MeetingCreateViewer result = MeetingCreateViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class MeetingCreateViewer.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        MeetingCreateViewer instance = new MeetingCreateViewer();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class MeetingCreateViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        MeetingCreateViewer instance = new MeetingCreateViewer();
        instance.handleInput(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class MeetingCreateViewer.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String text = "";
        MeetingCreateViewer instance = new MeetingCreateViewer();
        boolean expResult = false;
        boolean result = instance.isEmpty(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExit method, of class MeetingCreateViewer.
     */
    @Test
    public void testIsExit() {
        System.out.println("isExit");
        String text = "";
        MeetingCreateViewer instance = new MeetingCreateViewer();
        boolean expResult = false;
        boolean result = instance.isExit(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInteger method, of class MeetingCreateViewer.
     */
    @Test
    public void testIsInteger() {
        System.out.println("isInteger");
        String s = "";
        boolean expResult = false;
        boolean result = MeetingCreateViewer.isInteger(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
