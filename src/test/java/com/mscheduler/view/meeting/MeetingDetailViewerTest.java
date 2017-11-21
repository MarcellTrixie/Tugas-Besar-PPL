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
public class MeetingDetailViewerTest {
    
    public MeetingDetailViewerTest() {
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
     * Test of getInstance method, of class MeetingDetailViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MeetingDetailViewer expResult = null;
        MeetingDetailViewer result = MeetingDetailViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class MeetingDetailViewer.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        int id = 0;
        MeetingDetailViewer instance = new MeetingDetailViewer();
        String expResult = "";
        String result = instance.getText(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class MeetingDetailViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        int meetingId = 0;
        MeetingDetailViewer instance = new MeetingDetailViewer();
        instance.handleInput(sc, meetingId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class MeetingDetailViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        MeetingDetailViewer instance = new MeetingDetailViewer();
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
