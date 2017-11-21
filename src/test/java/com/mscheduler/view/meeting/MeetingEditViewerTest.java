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
public class MeetingEditViewerTest {
    
    public MeetingEditViewerTest() {
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
     * Test of getInstance method, of class MeetingEditViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MeetingEditViewer expResult = null;
        MeetingEditViewer result = MeetingEditViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class MeetingEditViewer.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        int id = 0;
        MeetingEditViewer instance = new MeetingEditViewer();
        String expResult = "";
        String result = instance.getText(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class MeetingEditViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        int meeting_id = 0;
        MeetingEditViewer instance = new MeetingEditViewer();
        instance.handleInput(sc, meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editAllMeeting method, of class MeetingEditViewer.
     */
    @Test
    public void testEditAllMeeting() {
        System.out.println("editAllMeeting");
        Scanner sc = null;
        int meetingId = 0;
        MeetingEditViewer instance = new MeetingEditViewer();
        Meeting expResult = null;
        Meeting result = instance.editAllMeeting(sc, meetingId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class MeetingEditViewer.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        String text = "";
        MeetingEditViewer instance = new MeetingEditViewer();
        boolean expResult = false;
        boolean result = instance.isEmpty(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isExit method, of class MeetingEditViewer.
     */
    @Test
    public void testIsExit() {
        System.out.println("isExit");
        String text = "";
        MeetingEditViewer instance = new MeetingEditViewer();
        boolean expResult = false;
        boolean result = instance.isExit(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class MeetingEditViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        MeetingEditViewer instance = new MeetingEditViewer();
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
