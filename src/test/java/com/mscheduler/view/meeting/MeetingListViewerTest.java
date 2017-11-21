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
public class MeetingListViewerTest {
    
    public MeetingListViewerTest() {
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
     * Test of getInstance method, of class MeetingListViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MeetingListViewer expResult = null;
        MeetingListViewer result = MeetingListViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class MeetingListViewer.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        MeetingListViewer instance = new MeetingListViewer();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class MeetingListViewer.
     */
    @Test
    public void testGetText_0args() {
        System.out.println("getText");
        MeetingListViewer instance = new MeetingListViewer();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class MeetingListViewer.
     */
    @Test
    public void testGetText_int() {
        System.out.println("getText");
        int page = 0;
        MeetingListViewer instance = new MeetingListViewer();
        String expResult = "";
        String result = instance.getText(page);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class MeetingListViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        MeetingListViewer instance = new MeetingListViewer();
        instance.handleInput(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class MeetingListViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        MeetingListViewer instance = new MeetingListViewer();
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
