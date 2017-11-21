/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.view.meeting;

import com.mscheduler.model.Meeting;
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
public class MeetingStatusViewerTest {
    
    public MeetingStatusViewerTest() {
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
     * Test of getInstance method, of class MeetingStatusViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MeetingStatusViewer expResult = null;
        MeetingStatusViewer result = MeetingStatusViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class MeetingStatusViewer.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Meeting meeting = null;
        MeetingStatusViewer instance = new MeetingStatusViewer();
        String expResult = "";
        String result = instance.getText(meeting);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class MeetingStatusViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        int meeting_id = 0;
        MeetingStatusViewer instance = new MeetingStatusViewer();
        instance.handleInput(sc, meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class MeetingStatusViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        MeetingStatusViewer instance = new MeetingStatusViewer();
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
