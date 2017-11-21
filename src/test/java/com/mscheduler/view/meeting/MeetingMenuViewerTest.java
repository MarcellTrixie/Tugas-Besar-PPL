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
public class MeetingMenuViewerTest {
    
    public MeetingMenuViewerTest() {
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
     * Test of getInstance method, of class MeetingMenuViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MeetingMenuViewer expResult = null;
        MeetingMenuViewer result = MeetingMenuViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class MeetingMenuViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        MeetingMenuViewer instance = null;
        instance.handleInput(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class MeetingMenuViewer.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        String command = "";
        MeetingMenuViewer instance = null;
        AbstractMeetingViewer expResult = null;
        AbstractMeetingViewer result = instance.getView(command);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class MeetingMenuViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        MeetingMenuViewer instance = null;
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
