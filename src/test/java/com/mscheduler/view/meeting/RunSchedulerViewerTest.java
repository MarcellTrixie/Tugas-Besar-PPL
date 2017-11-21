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
public class RunSchedulerViewerTest {
    
    public RunSchedulerViewerTest() {
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
     * Test of getInstance method, of class RunSchedulerViewer.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        RunSchedulerViewer expResult = null;
        RunSchedulerViewer result = RunSchedulerViewer.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class RunSchedulerViewer.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Meeting meeting = null;
        RunSchedulerViewer instance = new RunSchedulerViewer();
        String expResult = "";
        String result = instance.getText(meeting);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleInput method, of class RunSchedulerViewer.
     */
    @Test
    public void testHandleInput() {
        System.out.println("handleInput");
        Scanner sc = null;
        int meeting_id = 0;
        RunSchedulerViewer instance = new RunSchedulerViewer();
        instance.handleInput(sc, meeting_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHelp method, of class RunSchedulerViewer.
     */
    @Test
    public void testGetHelp() {
        System.out.println("getHelp");
        RunSchedulerViewer instance = new RunSchedulerViewer();
        String expResult = "";
        String result = instance.getHelp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
